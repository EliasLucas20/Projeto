package br.edu.academico.esperanca.projetoBDPOO;

public interface InterfaceFesta {
	
	public void cadastrarFesta(Participante participante, Fornecedor fornecedor);
	public void cadastrarPessoa(Pessoa pessoa);
	public void cadastrarParticipante(Participante participante, Festa festa);
	public void cadastrarProduto(Produto produto, Fornecedor fornecedor);
	public void cadastrarProdutoAdqui(ProdutoAdqui produtoAdqui, Produto produto, Fornecedor fornecedor, Festa festa);

}
