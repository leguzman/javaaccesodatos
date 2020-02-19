package com.asw.springbootaccesodatos.model.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.asw.springbootaccesodatos.model.entities.Personas;
import com.asw.springbootaccesodatos.model.repository.PersonasRepository;
import com.asw.springbootaccesodatos.model.services.PersonasService;

@Service
public class PersonasServiceImp implements PersonasService{

	@Autowired
	private PersonasRepository personasRepository;
	@Override
	public List<Personas> findAll() {
		// TODO Auto-generated method stub
		return (List<Personas>) personasRepository.findAll();
	}
	@Override
	public Personas findById(Long id) {
		// TODO Auto-generated method stub
		return personasRepository.findById(id).orElse(null);
	}
	@Override
	public Personas save(Personas persona) {
		// TODO Auto-generated method stub
		
		return personasRepository.save(persona);
		
	}
	@Override
	public Personas update(Long id, Personas persona) {
		// TODO Auto-generated method stub
		if(personasRepository.findById(id).isPresent()) {
			return personasRepository.save(persona);
		}
		
		return null;
	}
	@Override
	public HttpStatus delete(Long id) {
		// TODO Auto-generated method stub
		 personasRepository.deleteById(id);
		 return HttpStatus.OK;
	}
	@Override
	public int calcularEdad(Long id) {
		// TODO Auto-generated method stub
		return personasRepository.calcularEdad(id);
	}
	
	
	

}
