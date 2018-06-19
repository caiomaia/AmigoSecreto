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
public class Vestuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private int camisaNumero;
	
	@Column
	private int calçaNumero;
	
	@Column
	private int sapatoNumero;
	
	@JoinColumn
	@OneToOne
	private Modelo modelo;

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
	
	public Modelo getModelo() {
		return modelo;
	}
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vestuario other = (Vestuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
