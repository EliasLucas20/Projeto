package br.edu.academico.esperanca.projetoBDPOO;


public class CpfInexistente extends RuntimeException {
	
	public CpfInexistente() {
		super("Você não colocou o CPF");
	}

}
