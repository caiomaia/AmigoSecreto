package br.fateczl.les.amigosecreto.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.fateczl.les.amigosecreto.dao.ParticipanteDAO;
import br.fateczl.les.amigosecreto.entidade.Convidar;
import br.fateczl.les.amigosecreto.entidade.Participante;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ConvidarBean implements Serializable {

	private Convidar convidar;

	private Participante participante;

	private List<Participante> participantesAtuais;

	public List<Participante> getParticipantesAtuais() {
		return participantesAtuais;
	}
	
	public Participante getParticipante() {
		return participante;
	}
	
	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public void setParticipantesAtuais(List<Participante> participantesAtuais) {
		this.participantesAtuais = participantesAtuais;
	}

	public Convidar getConvidar() {
		return convidar;
	}

	public void setConvidar(Convidar convidar) {
		this.convidar = convidar;
	}

	public void novo() {
		participante = new Participante();
	}

	
	public void adicionar(){
		try {
			participantesAtuais.add(participante);
			ParticipanteDAO participanteDAO = new ParticipanteDAO();
			participanteDAO.salvar(participante);
			FacesMessage msgS = new FacesMessage("Pessoa adicionada");
			FacesContext.getCurrentInstance().addMessage(null, msgS);
		} catch (RuntimeException erro){
			erro.printStackTrace();
		}
	}

	public void excluir(ActionEvent evento) {
		try { participante = (Participante) evento.getComponent().getAttributes().get("participanteSelecionado");
		participantesAtuais.remove(participante);
		ParticipanteDAO participanteDAO = new ParticipanteDAO();
		participanteDAO.excluir(participante);
		} catch (RuntimeException erro){
			erro.printStackTrace();
		}
	}

}
