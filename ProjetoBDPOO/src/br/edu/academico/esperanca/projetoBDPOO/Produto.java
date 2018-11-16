package br.edu.academico.esperanca.projetoBDPOO;

import java.util.ArrayList;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double pre�o;
	private ArrayList<Fornecedor> fornece;
	private ArrayList<ProdutoAdqui> adquirido;
	
	public Produto(Integer id, String nome, Double pre�o, ArrayList<Fornecedor> fornece,
			ArrayList<ProdutoAdqui> adquirido) {
		super();
		this.id = id;
		this.nome = nome;
		this.pre�o = pre�o;
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
	public Double getPre�o() {
		return pre�o;
	}
	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
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
		result = prime * result + ((pre�o == null) ? 0 : pre�o.hashCode());
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
		if (pre�o == null) {
			if (other.pre�o != null)
				return false;
		} else if (!pre�o.equals(other.pre�o))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", pre�o=" + pre�o + ", fornece=" + fornece + ", adquirido="
				+ adquirido + "]";
	}

}
