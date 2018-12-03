package br.edu.academico.esperanca.projetoBDPOO;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Festa implements Identificavel{
	
	@Id
	private Integer id;
	private Integer sala;
	private Double valor_arrecadado;
	@OneToMany
	@JoinColumn(name = "id_participante")
	private Set<Participante> participa;
	@OneToMany
	@JoinColumn(name = "id_produtoAdqui")
	private Set<ProdutoAdqui> adquirido;
	@Transient
	private Double valor;
	
	public Festa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Festa(Integer id, Integer sala, Double valor_arrecadado, Set<Participante> participa,
			Set<ProdutoAdqui> adquirido, Double valor) {
		super();
		this.id = id;
		this.sala = sala;
		this.valor_arrecadado = valor_arrecadado;
		this.participa = participa;
		this.adquirido = adquirido;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSala() {
		return sala;
	}
	public void setSala(Integer sala) {
		this.sala = sala;
	}
	public Double getValor_arrecadado() {
		return valor_arrecadado;
	}
	public void setValor_arrecadado(Double valor_arrecadado) {
		this.valor_arrecadado = valor_arrecadado;
	}
	public Set<Participante> getParticipa() {
		return participa;
	}
	public void setParticipa(Set<Participante> participa) {
		this.participa = participa;
	}
	public Set<ProdutoAdqui> getAdquirido() {
		return adquirido;
	}
	public void setAdquirido(Set<ProdutoAdqui> adquirido) {
		this.adquirido = adquirido;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adquirido == null) ? 0 : adquirido.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((participa == null) ? 0 : participa.hashCode());
		result = prime * result + ((sala == null) ? 0 : sala.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		result = prime * result + ((valor_arrecadado == null) ? 0 : valor_arrecadado.hashCode());
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
		Festa other = (Festa) obj;
		if (adquirido == null) {
			if (other.adquirido != null)
				return false;
		} else if (!adquirido.equals(other.adquirido))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (participa == null) {
			if (other.participa != null)
				return false;
		} else if (!participa.equals(other.participa))
			return false;
		if (sala == null) {
			if (other.sala != null)
				return false;
		} else if (!sala.equals(other.sala))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		if (valor_arrecadado == null) {
			if (other.valor_arrecadado != null)
				return false;
		} else if (!valor_arrecadado.equals(other.valor_arrecadado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Festa [id=" + id + ", sala=" + sala + ", valor_arrecadado=" + valor_arrecadado + ", participa="
				+ participa + ", adquirido=" + adquirido + ", valor=" + valor + "]";
	}

	public double getValorFesta() {

		for (ProdutoAdqui p : adquirido) {
			valor += (p.getPreco() * p.getQnt());
		}
		return valor;
	}

	public double getValorParti() {
		double valorParti = valor / getParticipa().size();
		return valorParti;
	}

}
