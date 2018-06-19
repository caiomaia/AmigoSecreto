package br.fateczl.les.amigosecreto.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.fateczl.les.amigosecreto.entidade.Modelo;
import br.fateczl.les.amigosecreto.entidade.Participante;
import br.fateczl.les.amigosecreto.service.CadastroParticipanteService;
import br.fateczl.les.amigosecreto.service.NegocioException;

@Named
@ViewScoped
@ManagedBean
public class ParticipanteBean implements Serializable{
	
	
	private List<Modelo> modelos;

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
	
	public List<Modelo> getModelos() {
		return modelos;
	}
	
	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

}

