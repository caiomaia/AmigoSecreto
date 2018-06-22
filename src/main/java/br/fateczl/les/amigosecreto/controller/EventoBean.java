package br.fateczl.les.amigosecreto.controller;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import br.fateczl.les.amigosecreto.entidade.Evento;
import br.fateczl.les.amigosecreto.service.CadastroEventoService;
@ManagedBean
// @Named // CDI utilizado para auxilio na tarefa de gestão de dependencias.
@ViewScoped //matem a bean enquanto estiver executando a pagina
public class EventoBean implements Serializable{
	private static final long serialVersionUID = -7005920632783536965L;

	private CadastroEventoService cadastroeventoservice;
	
	private Evento evento = new Evento();
	
	public String salvar(){
		try {
			//this.cadastroeventoservice.salvar(evento);
			//EventoDAO eventoDAO = new EventoDAO();
			//eventoDAO.salvar(evento);
			System.out.println("Salvar executado:");
			System.out.println(evento.getNome() + evento.getCep());
			
		} catch (RuntimeException e) {
			//FacesUtil.addErrorMessage(e.getMessage());
			e.printStackTrace();
		}
		return "evento";
	}
	
	@PostConstruct // 
	public void initializle(){
		FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		limpar();
	}
	
	public void limpar(){
		System.out.println("Evento criado");
		evento = new Evento();
	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	
}
