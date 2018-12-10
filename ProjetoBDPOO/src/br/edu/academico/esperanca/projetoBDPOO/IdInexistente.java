package br.edu.academico.esperanca.projetoBDPOO;

public class IdInexistente extends RuntimeException {
	
	public IdInexistente() {
		super("Você não colocou o Id");
	}

}
