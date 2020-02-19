package com.asw.springbootaccesodatos.model.entities;

import javax.persistence.*;

@Entity
//@Table(name="Vehiculos")
public class Vehiculos {
	@Id
	private String placa;
	
	private String ciudad;
	
	private String propietario;
	
	private String marca;
	
	private int modelo;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
}
