package br.fateczl.les.amigosecreto.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.fateczl.les.amigosecreto.dao.EventoDAO;
import br.fateczl.les.amigosecreto.entidade.Evento;

public class CadastroEventoService implements Serializable {
	@Inject
	private EventoDAO eventoDAO;
	
	public void salvar(Evento evento) throws NegocioException{
		if(evento.getNome()== null || evento.getNome().trim().equals("")){
			throw new NegocioException("O nome do evento é obrigatório");
		}
		this.eventoDAO.salvar(evento);
	}

}
