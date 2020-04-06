package com.digov.gescon.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AvaliacaoAssessor")
public class Contratos implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	private String cliente;
	private String nome;
	private String dataForm;
	private String dataIniVig;
	private String dataFimVig;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataForm() {
		return dataForm;
	}
	public void setDataForm(String dataForm) {
		this.dataForm = dataForm;
	}
	public String getDataIniVig() {
		return dataIniVig;
	}
	public void setDataIniVig(String dataIniVig) {
		this.dataIniVig = dataIniVig;
	}
	public String getDataFimVig() {
		return dataFimVig;
	}
	public void setDataFimVig(String dataFimVig) {
		this.dataFimVig = dataFimVig;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	

}
