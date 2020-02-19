package com.asw.springbootaccesodatos.model.repository.impl;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import com.asw.springbootaccesodatos.model.repository.PersonasRepositoryCustom;

public class PersonasRepositoryCustomImpl implements PersonasRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public int calcularEdad(Long id) {
		//crear sentencia de llamado al procedimiento
		StoredProcedureQuery sp = em.createStoredProcedureQuery("CRUD_SPRING.PRC_CALCULA_EDAD");
		//PARAMETROS DEL PROCEDIMIENTO
		sp.registerStoredProcedureParameter("IP_ID",long.class,ParameterMode.IN);
		sp.registerStoredProcedureParameter("OP_EDAD", int.class,ParameterMode.OUT);
		//configurar valor de entrada
		sp.setParameter("IP_ID", id);
		//ejecutar el llamado al procedimiento
		sp.execute();
		//capturar valores de salida del procedimiento
		final int edad = (int) sp.getOutputParameterValue("OP_EDAD");
		
		
		return edad;
		
	}

	
	

}
