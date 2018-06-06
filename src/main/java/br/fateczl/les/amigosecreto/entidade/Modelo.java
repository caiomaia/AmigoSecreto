package br.fateczl.les.amigosecreto.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modelo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private int Social;
	
	@Column
	private int esportivo;
	
	@Column
	private int casual;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getSocial() {
		return Social;
	}

	public void setSocial(int social) {
		Social = social;
	}

	public int getEsportivo() {
		return esportivo;
	}

	public void setEsportivo(int esportivo) {
		this.esportivo = esportivo;
	}

	public int getCasual() {
		return casual;
	}

	public void setCasual(int casual) {
		this.casual = casual;
	}
	
	
	
}
