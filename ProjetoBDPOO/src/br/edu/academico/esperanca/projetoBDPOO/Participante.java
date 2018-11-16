package br.edu.academico.esperanca.projetoBDPOO;

public class Participante {

	private Integer matricula;
	private String nome;
	private Integer valor_parti;
	
	public Participante(Integer matricula, String nome, Integer valor_parti) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.valor_parti = valor_parti;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getValor_parti() {
		return valor_parti;
	}
	public void setValor_parti(Integer valor_parti) {
		this.valor_parti = valor_parti;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((valor_parti == null) ? 0 : valor_parti.hashCode());
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
		Participante other = (Participante) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (valor_parti == null) {
			if (other.valor_parti != null)
				return false;
		} else if (!valor_parti.equals(other.valor_parti))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Participante [matricula=" + matricula + ", nome=" + nome + ", valor_parti=" + valor_parti + "]";
	}
	
}
