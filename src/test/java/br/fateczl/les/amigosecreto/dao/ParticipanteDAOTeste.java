package br.fateczl.les.amigosecreto.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.fateczl.les.amigosecreto.entidade.Participante;

public class ParticipanteDAOTeste {

	@Test
	//@Ignore
	public void salvar(){
		Participante participante = new Participante();
		participante.setNome("Caio");
		participante.setDicaPresente("Corinthians");
		participante.setEmail("caio@fatec.com");
		
		ParticipanteDAO participanteDAO = new ParticipanteDAO();
		participanteDAO.salvar(participante);
	}
	
	@Test
	@Ignore
	public void buscar(){
		Long id = 5L;
		ParticipanteDAO participanteDAO = new ParticipanteDAO();
		Participante participante = participanteDAO.buscar(id);
		if (participante == null){
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Nome: " + participante.getNome());
			System.out.println("e-mail: " + participante.getEmail());
			System.out.println("Dica de Presente: " + participante.getDicaPresente());
		}
	}
	
	@Ignore
	@Test
	public void excluir(){
		Long id = 5L;
		ParticipanteDAO participanteDAO = new ParticipanteDAO();
		Participante participante = participanteDAO.buscar(id);
		if (participante == null){
			System.out.println("Nenhum registro encontrado");
		} else {
			participanteDAO.excluir(participante);
		}
	}
}
