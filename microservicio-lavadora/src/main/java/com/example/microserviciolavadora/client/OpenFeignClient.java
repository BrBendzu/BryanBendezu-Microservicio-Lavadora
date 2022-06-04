package com.example.microserviciolavadora.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.microserviciolavadora.model.Ropa;

@FeignClient(name = "idat-ropa", url="localhost:8082")
public interface OpenFeignClient {
	
	
	@GetMapping("/ropa/v1/listar")
	public List<Ropa>listarRopa();

}
