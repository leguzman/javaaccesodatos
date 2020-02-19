package com.asw.springbootaccesodatos.model.repository;

import com.asw.springbootaccesodatos.model.entities.Vehiculos;

public interface VehiculosRepositoryCustom {

	public String insertarVehiculo(Vehiculos vehiculo);
	public String eliminarVehiculo(String id);
	public String actualizarVehiculo(Vehiculos vehiculo);

}
