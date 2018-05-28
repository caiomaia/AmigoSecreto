package br.fateczl.les.amigosecreto.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaEntityManager {
	private static EntityManager entityManager = createEntityManager();

	public static EntityManager getEntityManager() {
		return entityManager;
	}

	private static EntityManager createEntityManager() {
		EntityManagerFactory factory = null;
		try {
			// Obtém o factory a partir da unidade de persistência.
			factory = Persistence.createEntityManagerFactory("AmigoSecretoUnit");
			// Cria um entity manager.
			entityManager = factory.createEntityManager();
		} catch (Throwable ex) {
			System.err.println("A fábrica de sessões não pode ser criada." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		return entityManager;
	}
}
