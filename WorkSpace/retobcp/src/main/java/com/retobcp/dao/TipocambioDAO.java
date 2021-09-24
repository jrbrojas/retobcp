package com.retobcp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.retobcp.model.Tipocambio;

public interface TipocambioDAO extends JpaRepository<Tipocambio, Integer>	{
@Query ("select t from Tipocambio t where t.nombreOrigen = ?1 and t.nombreDestino = ?2")
	Tipocambio findbyTipocambio (String monedaorigen, String monedadestino);
}
