package br.fateczl.les.amigosecreto.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Participante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String nome;
	
	@Column
	private String sobrenome;
	
	@Column
	private String whatsapp;
	
	@Column
	private String telefonefixo;
	
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
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getTelefonefixo() {
		return telefonefixo;
	}
	
	public void setTelefonefixo(String telefonefixo) {
		this.telefonefixo = telefonefixo;
	}
	
	public String getWhatsapp() {
		return whatsapp;
	}
	
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	
}
