package com.asw.springbootaccesodatos.model.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
//@Table(name="PERSONAS")
public class Personas {
	@Id
	private long Id;
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getFechaNac() {
		return FechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		FechaNac = fechaNac;
	}

	private String Nombres;
	
	private String Email;
	
	@Column(name= "fecha_nac")
	@Temporal(TemporalType.DATE)
	private Date FechaNac;
}
