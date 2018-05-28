package br.fateczl.les.amigosecreto.entidade;

import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
