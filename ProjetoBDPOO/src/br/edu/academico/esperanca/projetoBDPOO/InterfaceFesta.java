package br.edu.academico.esperanca.projetoBDPOO;

import java.util.Set;

public interface InterfaceFesta {
	
	public void cadastrarFesta(Festa festa, Set<Participante> participante, Set<ProdutoAdqui> adquirido) throws IdInexistente;                                                             ;
	
	public void cadastrarPessoa(Pessoa pessoa) throws CpfInexistente;

	public void cadastrarParticipante(Participante participante, Pessoa pessoa) throws IdInexistente, CpfInexistente;

	public void removerFesta(Festa festa, Set<Participante> participante, Set<ProdutoAdqui> adquirido) throws IdInexistente;
	
	public void removerPessoa(Pessoa pessoa) throws CpfInexistente;
	
	public void removerParticipante(Participante participante, Pessoa pessoa) throws IdInexistente, CpfInexistente;
	
	

}
