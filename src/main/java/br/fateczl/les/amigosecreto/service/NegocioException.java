package br.fateczl.les.amigosecreto.service;

public class NegocioException extends Exception{
	
	//Construtor que enviara a mensagem de excessão
	public NegocioException(String message){
		super(message);
	}

}
