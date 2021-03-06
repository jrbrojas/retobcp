package com.retobcp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tipocambio {

	@Id
	private Integer id;
	
	@Column
	private String nombreOrigen;
	
	@Column
	private String nombreDestino;
	
	@Column
	private float tc;
	
	@Column
	private String accion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreOrigen() {
		return nombreOrigen;
	}

	public void setNombreOrigen(String nombreOrigen) {
		this.nombreOrigen = nombreOrigen;
	}

	public String getNombreDestino() {
		return nombreDestino;
	}

	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

	public float getTc() {
		return tc;
	}

	public void setTc(float tc) {
		this.tc = tc;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	
	
}
