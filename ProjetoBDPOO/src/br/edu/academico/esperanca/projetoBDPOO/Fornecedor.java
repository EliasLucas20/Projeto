package br.edu.academico.esperanca.projetoBDPOO;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Fornecedor implements Identificavel {

	@Id
	private Integer id;
	private String nome;
	private String tipo;
	@OneToMany
	@JoinColumn(name = "id_ProdutoAdqui")
	private Set<ProdutoAdqui> vem;
	
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fornecedor(Integer id, String nome, String tipo, Set<ProdutoAdqui> vem) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.vem = vem;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Set<ProdutoAdqui> getVem() {
		return vem;
	}
	public void setVem(Set<ProdutoAdqui> vem) {
		this.vem = vem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((vem == null) ? 0 : vem.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
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
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (vem == null) {
			if (other.vem != null)
				return false;
		} else if (!vem.equals(other.vem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", vem=" + vem + "]";
	}
	
	
	
	
	
	
	
}
