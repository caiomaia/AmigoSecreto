package br.fateczl.les.amigosecreto.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Participante implements Serializable{
	
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
	
	@OneToOne
	@JoinColumn
	private Vestuario vestuario;
	
	@OneToOne
	@JoinColumn
	private Acesso acesso;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getTelefonefixo() {
		return telefonefixo;
	}
	
	public void setTelefonefixo(String telefonefixo) {
		this.telefonefixo = telefonefixo;
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
	
	public Vestuario getVestuario() {
		return vestuario;
	}
	
	public void setVestuario(Vestuario vestuario) {
		this.vestuario = vestuario;
	}
	
	public Acesso getAcesso() {
		return acesso;
	}
	
	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}
}
