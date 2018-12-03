package br.edu.academico.esperanca.projetoBDPOO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProdutoAdqui implements Identificavel {
	
	@Id
	private Integer id;
	private String nome;
	private Double preco;
	private Integer qnt;
	
	public ProdutoAdqui() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProdutoAdqui(Integer id, String nome, Double preco, Integer qnt) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qnt = qnt;
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
	public Integer getQnt() {
		return qnt;
	}
	public void setQnt(Integer qnt) {
		this.qnt = qnt;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((qnt == null) ? 0 : qnt.hashCode());
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
		ProdutoAdqui other = (ProdutoAdqui) obj;
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
		if (qnt == null) {
			if (other.qnt != null)
				return false;
		} else if (!qnt.equals(other.qnt))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ProdutoAdqui [id=" + id + ", nome=" + nome + ", preco=" + preco + ", qnt=" + qnt + "]";
	}
	
	
	
		

}
