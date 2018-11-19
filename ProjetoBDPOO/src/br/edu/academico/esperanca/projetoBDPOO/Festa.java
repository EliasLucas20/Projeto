package br.edu.academico.esperanca.projetoBDPOO;

import java.util.ArrayList;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

public class Festa {
	@Id
	private Integer id;
	private Integer sala;
	private Double valor_arrecadado;
	@ManyToMany
	@JoinTable(name = "participa_festa", joinColumns = @JoinColumn(name = "festa_id"), inverseJoinColumns = @JoinColumn(name = "participante_id"))
	private ArrayList<Participante> participa;
	private ArrayList<Participante> org;
	private ArrayList<Produto> adquirido;

	public Festa(Integer id, Integer sala, Double valor_arrecadado, ArrayList<Participante> participa,
			ArrayList<Participante> org, ArrayList<Produto> adquirido) {
		super();
		this.id = id;
		this.sala = sala;
		this.valor_arrecadado = valor_arrecadado;
		this.participa = participa;
		this.org = org;
		this.adquirido = adquirido;
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

	public ArrayList<Participante> getParticipa() {
		return participa;
	}

	public void setParticipa(ArrayList<Participante> participa) {
		this.participa = participa;
	}

	public ArrayList<Participante> getOrg() {
		return org;
	}

	public void setOrg(ArrayList<Participante> org) {
		this.org = org;
	}

	public ArrayList<Produto> getAdquirido() {
		return adquirido;
	}

	public void setAdquirido(ArrayList<Produto> adquirido) {
		this.adquirido = adquirido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adquirido == null) ? 0 : adquirido.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((org == null) ? 0 : org.hashCode());
		result = prime * result + ((participa == null) ? 0 : participa.hashCode());
		result = prime * result + ((sala == null) ? 0 : sala.hashCode());
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
		if (org == null) {
			if (other.org != null)
				return false;
		} else if (!org.equals(other.org))
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
				+ participa + ", org=" + org + ", adquirido=" + adquirido + "]";
	}

	double valor;

	public double getValorFesta() {

		for (Produto p : adquirido) {
			valor += (p.getPreço() * p.getQnt());
		}
		return valor;
	}

	public double getValorParti() {
		double valorParti = valor / getParticipa().size();
		return valorParti;
	}

}
