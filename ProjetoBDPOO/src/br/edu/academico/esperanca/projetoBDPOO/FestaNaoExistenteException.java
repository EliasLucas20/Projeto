package br.edu.academico.esperanca.projetoBDPOO;

public class FestaNaoExistenteException extends Exception {
	
	public FestaNaoExistenteException() {
		super("Festa Já existe");
	}
}
