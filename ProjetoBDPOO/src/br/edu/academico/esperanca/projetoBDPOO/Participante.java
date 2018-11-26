package br.edu.academico.esperanca.projetoBDPOO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Participante {
	@Id
	private Integer id;
	private boolean org;
	private boolean pagou;
	private Double valorPago;
	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Pessoa pessoa;
	
	public Participante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Participante(Integer id, boolean org, boolean pagou, Double valorPago, Pessoa pessoa) {
		super();
		this.id = id;
		this.org = org;
		this.pagou = pagou;
		this.valorPago = valorPago;
		this.pessoa = pessoa;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isOrg() {
		return org;
	}
	public void setOrg(boolean org) {
		this.org = org;
	}
	public boolean isPagou() {
		return pagou;
	}
	public void setPagou(boolean pagou) {
		this.pagou = pagou;
	}
	public Double getValorPago() {
		return valorPago;
	}
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (org ? 1231 : 1237);
		result = prime * result + (pagou ? 1231 : 1237);
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
		result = prime * result + ((valorPago == null) ? 0 : valorPago.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (org != other.org)
			return false;
		if (pagou != other.pagou)
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		if (valorPago == null) {
			if (other.valorPago != null)
				return false;
		} else if (!valorPago.equals(other.valorPago))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Participante [id=" + id + ", org=" + org + ", pagou=" + pagou + ", valorPago=" + valorPago + ", pessoa="
				+ pessoa + "]";
	}
	
	
	
	
}
