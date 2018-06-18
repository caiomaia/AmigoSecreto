package br.fateczl.les.amigosecreto.controller;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.fateczl.les.amigosecreto.dao.EventoDAO;
import br.fateczl.les.amigosecreto.entidade.Evento;
import br.fateczl.les.amigosecreto.service.CadastroEventoService;
import br.fateczl.les.amigosecreto.service.NegocioException;

@ManagedBean
@Named // CDI utilizado para auxilio na tarefa de gestão de dependencias.
@ViewScoped //matem a bean enquanto estiver executando a pagina
public class EventoBean implements Serializable{
	
	private CadastroEventoService cadastroeventoservice;
	
	private Evento evento;
		
	public void salvar(){
		try {
			this.cadastroeventoservice.salvar(evento);
			EventoDAO eventoDAO = new EventoDAO();
			eventoDAO.salvar(evento);
			limpar();
			System.out.println("Salvo");
			
		} catch (NegocioException e) {
			//FacesUtil.addErrorMessage(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@PostConstruct // 
	public void initializle(){
		this.limpar();
		novo();
	}
	public void limpar(){
		this.evento = new Evento();
		
	}
	
	public void novo(){
		evento = new Evento();
	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	
	
}
