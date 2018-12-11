package br.edu.academico.esperanca.projetoBDPOO;

public class ProdutoNaoExistenteException extends Exception{
	
	public ProdutoNaoExistenteException() {
		super("Produto não existe");
	}
}
