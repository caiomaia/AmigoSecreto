package br.fateczl.les.amigosecreto.service;
import javax.inject.Inject;

import br.fateczl.les.amigosecreto.dao.ParticipanteDAO;
import br.fateczl.les.amigosecreto.entidade.Participante;

public class CadastroParticipanteService {
	@Inject
	private ParticipanteDAO participanteDAO;
	
	public void salvar(Participante participante) throws NegocioException{
		
		
		if(participante.getId()== null || participante.getId().equals("")){
			throw new NegocioException("O nome do participante é obrigatório");
		}
		else if(participante.getNome()== null || participante.getNome().trim().equals("")){
			throw new NegocioException("O nome do participante é obrigatório");
		}
		else if(participante.getSobrenome()== null || participante.getSobrenome().trim().equals("")){
			throw new NegocioException("O Sobrenome do participante é obrigatório");
		}
		else if(participante.getEmail()== null || participante.getEmail().trim().equals("")){
			throw new NegocioException("O Email do participante é obrigatório");
		}
		else if(participante.getWhatsapp()== null || participante.getWhatsapp().trim().equals("")){
			throw new NegocioException("O numero de WhatsApp do participante é obrigatório");
		}	
		else if(participante.getTelefonefixo()== null || participante.getTelefonefixo().trim().equals("")){
			throw new NegocioException("O telefone fixo do participante é obrigatório");
		}
		else if(participante.getDicaPresente()== null || participante.getDicaPresente().trim().equals("")){
			throw new NegocioException("A dica de presente do participante é obrigatório");
		}
		
		 
			
		this.participanteDAO.salvar(participante);
	}
}
