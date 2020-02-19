package com.asw.springbootaccesodatos.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.asw.springbootaccesodatos.model.entities.Vehiculos;
import com.asw.springbootaccesodatos.model.services.VehiculosService;


@RestController
@RequestMapping("/api2")
public class VehiculosRestController {
	@Autowired
	private VehiculosService vehiculosService;
	
	@PostMapping("/vehiculos")
	public String saveVehiculo(@RequestBody Vehiculos vehiculo) {
		return vehiculosService.insertarVehiculo(vehiculo);
	}
	@PutMapping("/vehiculos")
	public String updateVehiculo(@RequestBody Vehiculos vehiculo) {
		return vehiculosService.actualizarVehiculo(vehiculo);
	}
	@DeleteMapping("/vehiculos/{id}")
	public String deleteVehiculo(@PathVariable String id) {
		return vehiculosService.eliminarVehiculo(id);
	}


}
