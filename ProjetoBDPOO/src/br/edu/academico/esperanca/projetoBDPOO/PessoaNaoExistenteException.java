package br.edu.academico.esperanca.projetoBDPOO;

public class PessoaNaoExistenteException extends Exception{
	
	public PessoaNaoExistenteException() {
		super("Pessoa n�o existe");
	}
}
