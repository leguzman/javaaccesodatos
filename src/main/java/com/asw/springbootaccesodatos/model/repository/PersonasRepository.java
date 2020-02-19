package com.asw.springbootaccesodatos.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.asw.springbootaccesodatos.model.entities.Personas;

public interface PersonasRepository extends CrudRepository<Personas, Long>, PersonasRepositoryCustom{
	
	
	

}
