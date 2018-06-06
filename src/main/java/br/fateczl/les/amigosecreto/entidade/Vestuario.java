package br.fateczl.les.amigosecreto.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vestuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private int camisaNumero;
	
	@Column
	private int calçaNumero;
	
	@Column
	private int sapatoNumero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCamisaNumero() {
		return camisaNumero;
	}

	public void setCamisaNumero(int camisaNumero) {
		this.camisaNumero = camisaNumero;
	}

	public int getCalçaNumero() {
		return calçaNumero;
	}

	public void setCalçaNumero(int calçaNumero) {
		this.calçaNumero = calçaNumero;
	}

	public int getSapatoNumero() {
		return sapatoNumero;
	}

	public void setSapatoNumero(int sapatoNumero) {
		this.sapatoNumero = sapatoNumero;
	}
	
	
}
