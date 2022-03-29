package com.app.ipau.commons.problematicas.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Problematica3 implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "`idProblematica3`")
	private int idProblematica3;
	@Column(name = "`descripcion`")
	private String descripcion;
	@Column(columnDefinition = "bit default 0")
	private boolean esPrivada;

	public Problematica3() {
	}

	public Problematica3(int idProblematica3, String descripcion, boolean esPrivada) {
		this.idProblematica3 = idProblematica3;
		this.descripcion = descripcion;
		this.esPrivada = esPrivada;
	}

	public int getIdProblematica3() {
		return idProblematica3;
	}

	public void setIdProblematica2(int idProblematica3) {
		this.idProblematica3 = idProblematica3;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEsPrivada() {
		return esPrivada;
	}

	public void setEsPrivada(boolean esPrivada) {
		this.esPrivada = esPrivada;
	}

	public void setIdProblematica3(int idProblematica3) {
		this.idProblematica3 = idProblematica3;
	}

}
