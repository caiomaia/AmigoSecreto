package br.fateczl.les.amigosecreto.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Participante {

	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String dicaPresente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDicaPresente() {
		return dicaPresente;
	}
	public void setDicaPresente(String dicaPresente) {
		this.dicaPresente = dicaPresente;
	}
	
	
}
