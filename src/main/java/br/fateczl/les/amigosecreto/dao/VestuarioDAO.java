package br.fateczl.les.amigosecreto.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.fateczl.les.amigosecreto.entidade.Vestuario;
import br.fateczl.les.amigosecreto.util.FabricaEntityManager;

public class VestuarioDAO implements Serializable{
	
	public void salvar(Vestuario vestuario){ //salvar e editar*
		 
			EntityManager entityManager = FabricaEntityManager.getEntityManager();
			try {
				entityManager.getTransaction().begin();
				entityManager.merge(vestuario);  //com o merge, caso já exista algo ele substitui
				entityManager.getTransaction().commit();
			} finally {
				entityManager.close();
			}
		}
		
		public Vestuario buscar(Long id){
			EntityManager entityManager = FabricaEntityManager.getEntityManager();
			Vestuario resultado = null;
			try {
				resultado = entityManager.find(Vestuario.class, id);
			} finally {
				entityManager.close();
			}
			return resultado;
		}
		
		public void excluir(Vestuario vestuario){
			EntityManager entityManager = FabricaEntityManager.getEntityManager();
			try {
				entityManager.getTransaction().begin();
				entityManager.remove(vestuario);
				entityManager.getTransaction().commit();
			} finally {
				entityManager.close();
			}
		}
}
