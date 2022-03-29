package com.app.ipau.commons.problematicas.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Problematica1 implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "`idProblematica1`")
	private int idProblematica1;
	@Column(name = "`descripcion`")
	private String descripcion;
	@OneToMany
	@Column(name = "`subProblematicas2`")
	private List<Problematica2> subProblematicas2;
	@Column(name = "`rutaImg`")
	private String rutaImg;
	
	public Problematica1() {}

	public Problematica1(int idProblematica1, String descripcion, List<Problematica2> subProblematicas2,String rutaImg) {
		this.idProblematica1 = idProblematica1;
		this.descripcion = descripcion;
		this.subProblematicas2 = subProblematicas2;
		this.rutaImg = rutaImg;
	}

	public int getIdProblematica1() {
		return idProblematica1;
	}

	public void setIdProblematica1(int idProblematica1) {
		this.idProblematica1 = idProblematica1;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Problematica2> getSubProblematicas2() {
		return subProblematicas2;
	}

	public void setSubProblematicas2(List<Problematica2> subProblematicas2) {
		this.subProblematicas2 = subProblematicas2;
	}

	public String getRutaImg() {
		return rutaImg;
	}

	public void setRutaImg(String rutaImg) {
		this.rutaImg = rutaImg;
	}

}
