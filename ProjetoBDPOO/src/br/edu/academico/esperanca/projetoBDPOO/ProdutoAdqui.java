package br.edu.academico.esperanca.projetoBDPOO;

public class ProdutoAdqui {

	private Integer id;
	private String nome;
	private Double preço;
	private Integer quantidade;
	
	public ProdutoAdqui(Integer id, String nome, Double preço, Integer quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.preço = preço;
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
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
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
		result = prime * result + ((preço == null) ? 0 : preço.hashCode());
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
		if (preço == null) {
			if (other.preço != null)
				return false;
		} else if (!preço.equals(other.preço))
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
		return "ProdutoAdqui [id=" + id + ", nome=" + nome + ", preço=" + preço + ", quantidade=" + quantidade + "]";
	}
	

}
