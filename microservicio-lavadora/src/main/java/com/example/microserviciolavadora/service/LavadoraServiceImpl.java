package com.example.microserviciolavadora.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microserviciolavadora.client.OpenFeignClient;
import com.example.microserviciolavadora.model.Lavadora;


@Service
public class LavadoraServiceImpl implements LavadoraService{

	@Autowired
	private OpenFeignClient cliente;
	
	@Override
	public List<Lavadora> listarRopa() {

		List<Lavadora>listarLavadora = new ArrayList<>();
		
		Lavadora lavadora = new Lavadora();
		
		lavadora.setIdLavadora(1);
		lavadora.setMarca("Samsung");
		lavadora.setVoltaje("220V");
		lavadora.setDescripcion("Blanca");
		lavadora.setListarRopa(cliente.listarRopa());
		
		listarLavadora.add(lavadora);
		
		return listarLavadora;
	}
	
	

}
