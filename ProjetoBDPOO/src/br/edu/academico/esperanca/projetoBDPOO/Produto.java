package br.edu.academico.esperanca.projetoBDPOO;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Produto implements Identificavel {
	
	@Id
	private Integer id;
	private String nome;
	private Double preco;
	@ManyToMany
	@JoinTable(
			name = "produto_fornecedor", 
			joinColumns = @JoinColumn(name = "produto_id"), 
			inverseJoinColumns = @JoinColumn(name = "fornecedor_id"))
	private Set<Fornecedor> fornece;
	@OneToMany
	@JoinColumn(name = "id_ProdutoAdqui")
	private Set<ProdutoAdqui> adquirido;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer id, String nome, Double preco, Set<Fornecedor> fornece, Set<ProdutoAdqui> adquirido) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
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
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Set<Fornecedor> getFornece() {
		return fornece;
	}
	public void setFornece(Set<Fornecedor> fornece) {
		this.fornece = fornece;
	}
	public Set<ProdutoAdqui> getAdquirido() {
		return adquirido;
	}
	public void setAdquirido(Set<ProdutoAdqui> adquirido) {
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
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", fornece=" + fornece + ", adquirido="
				+ adquirido + "]";
	}
	
	
	
	
	
	
	
}
