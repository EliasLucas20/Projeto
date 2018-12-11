package br.edu.academico.esperanca.projetoBDPOO;

public class PessoaJaExistenteException extends Exception{
	
	public PessoaJaExistenteException() {
		super("´Pessoa Já existe");
	}
}
