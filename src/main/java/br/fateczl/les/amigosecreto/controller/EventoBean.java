package br.fateczl.les.amigosecreto.controller;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.fateczl.les.amigosecreto.entidade.Evento;
import br.fateczl.les.amigosecreto.service.CadastroEventoService;
import br.fateczl.les.amigosecreto.service.NegocioException;

@Named // CDI utilizado para auxilio na tarefa de gestão de dependencias.
@ViewScoped //matem a baen enquanto estiver execultando a pagina
public class EventoBean implements Serializable{
	
	private CadastroEventoService cadastroeventoservice;
	
	private Evento evento;
	
	public void salvar(){
		try {
			this.cadastroeventoservice.salvar(evento);
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
		this.evento = new Evento();
		
	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	
	
}
