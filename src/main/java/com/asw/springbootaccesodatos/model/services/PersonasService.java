package com.asw.springbootaccesodatos.model.services;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.asw.springbootaccesodatos.model.entities.Personas;


public interface PersonasService {
	
	public List<Personas> findAll();
	
	public Personas findById(Long id);
	
	public Personas save(Personas persona);
	
	public Personas update(Long id, Personas persona);
	
	public HttpStatus delete(Long id);
	
	public int calcularEdad(Long id);
	
	
	
	

}
