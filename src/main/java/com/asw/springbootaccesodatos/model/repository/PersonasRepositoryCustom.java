package com.asw.springbootaccesodatos.model.repository;

public interface PersonasRepositoryCustom {
	
	/**
	 * calcular la edad a partir de procedimiento almacenado
	 * @param id
	 * @return
	 */
	
	public int calcularEdad(Long id);

}
