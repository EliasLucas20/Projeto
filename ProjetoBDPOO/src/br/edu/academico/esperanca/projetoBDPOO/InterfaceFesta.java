package br.edu.academico.esperanca.projetoBDPOO;

import java.util.Set;

public interface InterfaceFesta {
	
	public void cadastrarProduto(Produto produto, Festa festa) throws ProdutoJaExistenteException, FestaJaExistenteException, ProdutoNaoExistenteException, FestaNaoExistenteException;                                                             ;
	
	public void cadastrarPessoa(Pessoa pessoa, Participante participante) throws PessoaJaExistenteException, ParticipanteJaExistenteException, PessoaNaoExistenteException, ParticipanteNaoExistenteException;

	public void cadastrarParticipante(Participante participante, Festa festa) throws ParticipanteJaExistenteException, FestaJaExistenteException, ParticipanteNaoExistenteException, FestaNaoExistenteException;                                                             ;;

	public void removerProduto(Integer id) throws ProdutoNaoExistenteException;
	
	public void removerPessoa(Integer cpf) throws PessoaNaoExistenteException;
	
	public void removerParticipante(Integer id) throws ParticipanteNaoExistenteException;
	
	

}
