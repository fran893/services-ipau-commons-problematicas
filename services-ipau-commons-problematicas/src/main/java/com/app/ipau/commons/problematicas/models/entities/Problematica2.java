package com.app.ipau.commons.problematicas.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Problematica2 implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "`idProblematica2`")
	private int idProblematica2;
	@Column(name = "`descripcion`")
	private String descripcion;
	@OneToMany
	@Column(name = "`subProblematicas3`")
	private List<Problematica3> subProblematicas3;
	@Column(columnDefinition = "bit default 0")
	private boolean esPrivada;

	public Problematica2() {
	}

	public Problematica2(int idProblematica2, String descripcion, List<Problematica3> subProblematicas3,
			boolean esPrivada) {
		this.idProblematica2 = idProblematica2;
		this.descripcion = descripcion;
		this.subProblematicas3 = subProblematicas3;
		this.esPrivada = esPrivada;
	}

	public int getIdProblematica2() {
		return idProblematica2;
	}

	public void setIdProblematica2(int idProblematica2) {
		this.idProblematica2 = idProblematica2;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Problematica3> getSubProblematicas3() {
		return subProblematicas3;
	}

	public void setSubProblematicas3(List<Problematica3> subProblematicas3) {
		this.subProblematicas3 = subProblematicas3;
	}

	public boolean isEsPrivada() {
		return esPrivada;
	}

	public void setEsPrivada(boolean esPrivada) {
		this.esPrivada = esPrivada;
	}

}
