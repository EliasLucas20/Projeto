package br.edu.academico.esperanca.projetoBDPOO;


public class CpfInexistente extends RuntimeException {
	
	public CpfInexistente() {
		super("Voc� n�o colocou o CPF");
	}

}
