package br.fateczl.les.amigosecreto.entidade;

import javax.persistence.Entity;

@Entity
public enum Modelo {

	social("Social"), esportivo("Esportivo"), casual("Casual");
	
	private String nome;
	
	Modelo(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
}
