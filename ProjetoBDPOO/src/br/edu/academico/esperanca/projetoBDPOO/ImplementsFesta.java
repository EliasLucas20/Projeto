package br.edu.academico.esperanca.projetoBDPOO;

import java.util.Collection;

public class ImplementsFesta implements InterfaceFesta {

	private DAO<Festa> daoFesta;
	private DAO<Produto> daoProduto;
	private DAO<Pessoa> daoPessoa;
	private DAO<Participante> daoParticipante; 
	
	@Override
	public void cadastrarProduto(Produto produto, Festa festa) throws ProdutoJaExistenteException,
			FestaJaExistenteException, ProdutoNaoExistenteException, FestaNaoExistenteException {
		if (produto == null) {
			throw new ProdutoNaoExistenteException();
		} else if (festa == null) {
			throw new FestaNaoExistenteException();
		} else if (produto.equals(daoProduto.find(Produto.class, produto.getId()))) {
			throw new ProdutoJaExistenteException();
		}
		Festa f = daoFesta.find(Festa.class, festa.getId());
		if (f.getAdquirido().contains(festa)) {
			throw new ProdutoJaExistenteException();
		}

		f.getAdquirido().addAll((Collection<? extends ProdutoAdqui>) festa);
		daoFesta.update(f);	}

	@Override
	public void cadastrarPessoa(Pessoa pessoa, Participante participante) throws PessoaJaExistenteException, 
			ParticipanteJaExistenteException, PessoaNaoExistenteException, ParticipanteNaoExistenteException {
		if (pessoa == null) {
			throw new PessoaNaoExistenteException();
		} else if (pessoa.equals(daoPessoa.find(Pessoa.class, pessoa.getCpf()))) {
			throw new PessoaJaExistenteException();
		}
		Participante p = daoParticipante.find(Participante.class, participante.getId());
		if (p.getPessoa().contains(participante)) {
			throw new PessoaJaExistenteException();
		}

		p.getPessoa().add(pessoa);
		daoParticipante.update(p);
		
	}

	@Override
	public void cadastrarParticipante(Participante participante, Festa festa) throws ParticipanteJaExistenteException,
			FestaJaExistenteException, ParticipanteNaoExistenteException, FestaNaoExistenteException {
		if (participante == null) {
			throw new ParticipanteNaoExistenteException();
		} else if (festa == null) {
			throw new FestaNaoExistenteException();
		} else if (participante.equals(daoParticipante.find(Participante.class, participante.getId()))) {
			throw new ParticipanteJaExistenteException();
		}
		Festa f = daoFesta.find(Festa.class, festa.getId());
		if (f.getParticipa().contains(festa)) {
			throw new ParticipanteJaExistenteException();
		}

		f.getParticipa().addAll((Collection<? extends Participante>) festa);
		daoFesta.update(f);	
	
	}
		

	@Override
	public void removerProduto(Integer id) throws ProdutoNaoExistenteException {
		DAO<Produto> daoPro = new DAO<>();
		Produto produto = daoPro.find(Produto.class, id);
		if (produto == null) {
			throw new ProdutoNaoExistenteException();
		}
		daoPro.remove(produto);
		
	}

	@Override
	public void removerPessoa(Integer cpf) throws PessoaNaoExistenteException {
		DAO<Pessoa> daoPessoa = new DAO<>();
		Pessoa pessoa = daoPessoa.find(Pessoa.class, cpf);
		if (pessoa == null) {
			throw new PessoaNaoExistenteException();
		}
		daoPessoa.remove(pessoa);
		
	}

	@Override
	public void removerParticipante(Integer id) throws ParticipanteNaoExistenteException {
		DAO<Participante> daoParticipante = new DAO<>();
		Participante participante = daoParticipante.find(Participante.class, id);
		if (participante == null) {
			throw new ParticipanteNaoExistenteException();
		}
		daoParticipante.remove(participante);
		
	}

	

}
