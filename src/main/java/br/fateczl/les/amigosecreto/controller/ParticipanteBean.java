package br.fateczl.les.amigosecreto.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import br.fateczl.les.amigosecreto.entidade.Participante;
import br.fateczl.les.amigosecreto.service.CadastroParticipanteService;
import br.fateczl.les.amigosecreto.service.NegocioException;

public class ParticipanteBean implements Serializable{

@Named
@ViewScoped
private CadastroParticipanteService cadastroparticipanteservice;
	
	private Participante participante;
	
	public void salvar(){
		try {
			this.cadastroparticipanteservice.salvar(participante);
		} catch (NegocioException e) {
			//FacesUtil.addErrorMessage(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@PostConstruct // 
	public void initializle(){
		this.limpar();
	}
	public void limpar(){
		this.participante = new Participante();
		
	}
	
	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}
	
}
