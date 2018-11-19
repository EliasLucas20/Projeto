package br.edu.academico.esperanca.projetoBDPOO;

import java.util.ArrayList;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double preco;
	private Integer qnt;
	private ArrayList<Fornecedor> fornece;
	private ArrayList<ProdutoAdqui> adquirido;
	
	public Produto(Integer id, String nome, Double preço, ArrayList<Fornecedor> fornece,
			ArrayList<ProdutoAdqui> adquirido) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preço;
		this.fornece = fornece;
		this.adquirido = adquirido;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreço() {
		return preco;
	}
	public void setPreço(Double preco) {
		this.preco = preco;
	}
	public ArrayList<Fornecedor> getFornece() {
		return fornece;
	}
	public void setFornece(ArrayList<Fornecedor> fornece) {
		this.fornece = fornece;
	}
	public ArrayList<ProdutoAdqui> getAdquirido() {
		return adquirido;
	}
	public void setAdquirido(ArrayList<ProdutoAdqui> adquirido) {
		this.adquirido = adquirido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adquirido == null) ? 0 : adquirido.hashCode());
		result = prime * result + ((fornece == null) ? 0 : fornece.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (adquirido == null) {
			if (other.adquirido != null)
				return false;
		} else if (!adquirido.equals(other.adquirido))
			return false;
		if (fornece == null) {
			if (other.fornece != null)
				return false;
		} else if (!fornece.equals(other.fornece))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preço=" + preco + ", fornece=" + fornece + ", adquirido="
				+ adquirido + "]";
	}

	public Integer getQnt() {
		return qnt;
	}

	public void setQnt(Integer qnt) {
		this.qnt = qnt;
	}

}
