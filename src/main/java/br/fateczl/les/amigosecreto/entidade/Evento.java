package br.fateczl.les.amigosecreto.entidade;

import java.io.Serializable;
import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable{

	@Id
	private Long id;
	
	
	@Column
	private String nome;

	@Column
	private DecimalFormat valorSugerido;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public DecimalFormat getValorSugerido() {
		return valorSugerido;
	}
	
	public void setValorSugerido(DecimalFormat valorSugerido) {
		this.valorSugerido = valorSugerido;
	}
}
