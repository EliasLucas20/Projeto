package br.edu.academico.esperanca.projetoBDPOO;

public class ProdutoAdqui {

	private Integer id;
	private String nome;
	private Double pre�o;
	private Integer quantidade;
	
	public ProdutoAdqui(Integer id, String nome, Double pre�o, Integer quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
		
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
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pre�o == null) ? 0 : pre�o.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
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
		if (pre�o == null) {
			if (other.pre�o != null)
				return false;
		} else if (!pre�o.equals(other.pre�o))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProdutoAdqui [id=" + id + ", nome=" + nome + ", pre�o=" + pre�o + ", quantidade=" + quantidade + "]";
	}
	

}
