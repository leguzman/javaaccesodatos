package com.asw.springbootaccesodatos.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.asw.springbootaccesodatos.model.entities.Personas;
import com.asw.springbootaccesodatos.model.services.PersonasService;

@RestController
@RequestMapping("/api")

public class PersonasRestController {
	@Autowired
	private PersonasService personasService;
	
	
	@GetMapping("/personas")
	public List<Personas>index(){
		return personasService.findAll();
	}
	
	@GetMapping("/personas/{id}")
	public Personas show(@PathVariable Long id){
		return personasService.findById(id);
	}
	
	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Personas save(@RequestBody Personas persona) {
		return personasService.save(persona);
	}
	
	@PutMapping("/personas/{id}")
	public Personas update(@PathVariable Long id,@RequestBody Personas persona) {
		
		return personasService.update(id, persona);
	}
	
	@DeleteMapping("/personas/{id}")
	public HttpStatus delete(@PathVariable Long id) {
		return personasService.delete(id);
	}
	
	@GetMapping("/personas/edad/{id}")
	public int getEdad(@PathVariable Long id){
		
		return personasService.calcularEdad(id);
		
	}
	

}

