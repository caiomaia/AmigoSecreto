package br.fateczl.les.amigosecreto.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.inject.Inject;
import br.fateczl.les.amigosecreto.entidade.Evento;

public class EventoDAO implements Serializable{
	
	@Inject
	private EntityManager em;
	
		public void salvar(Evento evento){
			em.persist(evento);
		}
}
