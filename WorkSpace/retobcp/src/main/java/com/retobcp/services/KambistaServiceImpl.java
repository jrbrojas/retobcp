package com.retobcp.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retobcp.dao.KambistaDAO;
import com.retobcp.dao.TipocambioDAO;
import com.retobcp.model.Kambista;
import com.retobcp.model.Tipocambio;

@Service
public class KambistaServiceImpl implements KambistaService{


	@Autowired
	private TipocambioDAO tipocambioDAO;
	
	@Autowired
	private KambistaDAO kambistaDAO;
	
	@Transactional
	@Override
	public Kambista convertirtc(float monto, String monedaorigen, String monedadestino) {
		// TODO Auto-generated method stub
	Tipocambio tipocambio = tipocambioDAO.findbyTipocambio(monedaorigen, monedadestino);
			
		
	float montotc = 0.0f;
	if (tipocambio.getAccion().equalsIgnoreCase("compra")) {
		montotc= monto / tipocambio.getTc();
		} else if (tipocambio.getAccion().equalsIgnoreCase("venta")) {
			montotc= monto * tipocambio.getTc();
		} 
			
	Kambista kambista = new Kambista();
	
	
	kambista.setMoneda_origen(monedaorigen);
	kambista.setMoneda_destino(monedadestino);
	kambista.setMonto(monto);
	kambista.setTc(tipocambio.getTc());
	kambista.setMonto_tc(montotc);
	
	kambista = kambistaDAO.save(kambista);
	    
		
		return kambista;
	}
		 	
}
