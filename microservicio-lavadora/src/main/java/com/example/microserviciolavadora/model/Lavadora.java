package com.example.microserviciolavadora.model;

import java.util.List;



public class Lavadora {
	
	private Integer idLavadora;	
	private String descripcion;
	private String marca;
	private String voltaje;
	private List<Ropa>listarRopa;
	
	public Integer getIdLavadora() {
		return idLavadora;
	}
	public void setIdLavadora(Integer idLavadora) {
		this.idLavadora = idLavadora;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}
	public List<Ropa> getListarRopa() {
		return listarRopa;
	}
	public void setListarRopa(List<Ropa> listarRopa) {
		this.listarRopa = listarRopa;
	}
	
	
	

}
