package br.edu.academico.esperanca.projetoBDPOO;

public class ParticipanteNaoExistenteException extends Exception{
	
	public ParticipanteNaoExistenteException() {
		super("Participante não existe");
	}
}
