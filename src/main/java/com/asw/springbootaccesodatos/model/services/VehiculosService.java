package com.asw.springbootaccesodatos.model.services;

import com.asw.springbootaccesodatos.model.entities.Vehiculos;

public interface VehiculosService {


	public String insertarVehiculo(Vehiculos vehiculo);
	public String eliminarVehiculo(String id);
	public String actualizarVehiculo(Vehiculos vehiculo);
}
