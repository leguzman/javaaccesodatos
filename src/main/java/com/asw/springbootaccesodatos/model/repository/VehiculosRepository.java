package com.asw.springbootaccesodatos.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.asw.springbootaccesodatos.model.entities.Personas;
import com.asw.springbootaccesodatos.model.entities.Vehiculos;

public interface VehiculosRepository  extends CrudRepository<Vehiculos, String>, VehiculosRepositoryCustom {

}
