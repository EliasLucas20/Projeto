package br.edu.academico.esperanca.projetoBDPOO;

public class ProdutoJaExistenteException extends Exception{
	
	public ProdutoJaExistenteException() {
		super("Produto Já existe");
	}

}
