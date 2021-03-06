package com.retobcp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.retobcp.model.Kambista;

import com.retobcp.services.KambistaService;

@RestController
@RequestMapping("kambista")
public class KambistaRest {
	
	@Autowired
	private KambistaService kambistaService;
	
	@GetMapping("/cambiar/{monto}/{monedaorigen}/{monedadestino}")
	public Kambista cambiar(@PathVariable float monto, @PathVariable String monedaorigen, @PathVariable String monedadestino){
		
		return kambistaService.convertirtc(monto, monedaorigen, monedadestino);
	}
}
