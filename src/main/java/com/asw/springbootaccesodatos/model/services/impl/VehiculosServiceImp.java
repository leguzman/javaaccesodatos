package com.asw.springbootaccesodatos.model.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asw.springbootaccesodatos.model.entities.Vehiculos;
import com.asw.springbootaccesodatos.model.repository.VehiculosRepository;
import com.asw.springbootaccesodatos.model.services.VehiculosService;
@Service
public class VehiculosServiceImp implements VehiculosService{

	@Autowired
	private VehiculosRepository vehiculosRepository;
	@Override
	public String insertarVehiculo(Vehiculos vehiculo) {
		// TODO Auto-generated method stub
		return vehiculosRepository.insertarVehiculo(vehiculo);
	}
	@Override
	public String eliminarVehiculo(String id) {
		// TODO Auto-generated method stub
		return vehiculosRepository.eliminarVehiculo(id);
	}
	@Override
	public String actualizarVehiculo(Vehiculos vehiculo) {
		// TODO Auto-generated method stub
		return vehiculosRepository.actualizarVehiculo(vehiculo);
	}
	
	
}
