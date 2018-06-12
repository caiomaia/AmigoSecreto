package br.fateczl.les.amigosecreto.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import br.fateczl.les.amigosecreto.entidade.Acesso;
import br.fateczl.les.amigosecreto.util.FabricaEntityManager;

public class AcessoDAO implements Serializable{
	
	public void salvar(Acesso acesso){ //salvar e editar*
		 
			EntityManager entityManager = FabricaEntityManager.getEntityManager();
			try {
				entityManager.getTransaction().begin();
				entityManager.merge(acesso);  //com o merge, caso já exista algo ele substitui
				entityManager.getTransaction().commit();
			} finally {
				entityManager.close();
			}
		}
		
		public Acesso buscar(Long id){
			EntityManager entityManager = FabricaEntityManager.getEntityManager();
			Acesso resultado = null;
			try {
				resultado = entityManager.find(Acesso.class, id);
			} finally {
				entityManager.close();
			}
			return resultado;
		}
		
		public void excluir(Acesso acesso){
			EntityManager entityManager = FabricaEntityManager.getEntityManager();
			try {
				entityManager.getTransaction().begin();
				entityManager.remove(acesso);
				entityManager.getTransaction().commit();
			} finally {
				entityManager.close();
			}
		}
}
