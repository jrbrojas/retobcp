package com.retobcp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retobcp.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer>	 {

}
