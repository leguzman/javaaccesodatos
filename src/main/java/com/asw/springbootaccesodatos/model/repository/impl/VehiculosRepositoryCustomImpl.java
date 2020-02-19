package com.asw.springbootaccesodatos.model.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import com.asw.springbootaccesodatos.model.entities.Vehiculos;
import com.asw.springbootaccesodatos.model.repository.VehiculosRepositoryCustom;

public class VehiculosRepositoryCustomImpl implements VehiculosRepositoryCustom{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public String insertarVehiculo(Vehiculos vehiculo) {
		StoredProcedureQuery sp = em.createStoredProcedureQuery("CRUD_SPRING.PRC_INSERTAR_VHC");
		sp.registerStoredProcedureParameter("IP_PLACA",String.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("IP_CIUDAD", String.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("IP_PROPIETARIO",String.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("IP_MARCA", String.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("IP_MODELO",int.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("OP_CREADO", String.class,ParameterMode.OUT);
		

		sp.setParameter("IP_PLACA", vehiculo.getPlaca());
		sp.setParameter("IP_CIUDAD", vehiculo.getCiudad());
		sp.setParameter("IP_PROPIETARIO", vehiculo.getPropietario());
		sp.setParameter("IP_MARCA", vehiculo.getMarca());

		sp.setParameter("IP_MODELO", vehiculo.getModelo());
		sp.execute();
		
		final String creado= (String) sp.getOutputParameterValue("OP_CREADO");
		return creado;
	}

	@Override
	public String eliminarVehiculo(String id) {
		StoredProcedureQuery sp = em.createStoredProcedureQuery("CRUD_SPRING.PRC_ELIMINAR_VHC");
		
		sp.registerStoredProcedureParameter("IP_PLACA",String.class,ParameterMode.IN);

		sp.registerStoredProcedureParameter("OP_ELIMINADO", String.class,ParameterMode.OUT);
		
		sp.setParameter("IP_PLACA", id);
		
		sp.execute();
		
		final String eliminado= (String) sp.getOutputParameterValue("OP_ELIMINADO");
		return eliminado;
	}

	@Override
	public String actualizarVehiculo(Vehiculos vehiculo) {
		StoredProcedureQuery sp = em.createStoredProcedureQuery("CRUD_SPRING.PRC_ACTUALIZAR_VHC");
		sp.registerStoredProcedureParameter("IP_PLACA",String.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("IP_CIUDAD", String.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("IP_PROPIETARIO",String.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("IP_MARCA", String.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("IP_MODELO",int.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("OP_ACTUALIZADO", String.class,ParameterMode.OUT);
		

		sp.setParameter("IP_PLACA", vehiculo.getPlaca());
		sp.setParameter("IP_CIUDAD", vehiculo.getCiudad());
		sp.setParameter("IP_PROPIETARIO", vehiculo.getPropietario());
		sp.setParameter("IP_MARCA", vehiculo.getMarca());

		sp.setParameter("IP_MODELO", vehiculo.getModelo());
		sp.execute();
		
		final String actualizado= (String) sp.getOutputParameterValue("OP_ACTUALIZADO");
		return actualizado;
	}
}
