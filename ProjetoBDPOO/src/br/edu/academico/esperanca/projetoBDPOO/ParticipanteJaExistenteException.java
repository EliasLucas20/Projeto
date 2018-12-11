package br.edu.academico.esperanca.projetoBDPOO;

public class ParticipanteJaExistenteException extends Exception{
	
	public ParticipanteJaExistenteException() {
		super("Participante Já existe");
	}
}
