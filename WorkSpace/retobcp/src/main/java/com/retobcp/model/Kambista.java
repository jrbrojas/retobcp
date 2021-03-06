package com.retobcp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kambista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private float monto;
	
	@Column
	private float monto_tc;
	
	@Column
	private String moneda_origen;
	
	@Column
	private String moneda_destino;
	
	@Column
	private float tc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public float getMonto_tc() {
		return monto_tc;
	}

	public void setMonto_tc(float monto_tc) {
		this.monto_tc = monto_tc;
	}

	public String getMoneda_origen() {
		return moneda_origen;
	}

	public void setMoneda_origen(String moneda_origen) {
		this.moneda_origen = moneda_origen;
	}

	public String getMoneda_destino() {
		return moneda_destino;
	}

	public void setMoneda_destino(String moneda_destino) {
		this.moneda_destino = moneda_destino;
	}

	public float getTc() {
		return tc;
	}

	public void setTc(float tc) {
		this.tc = tc;
	}

}
