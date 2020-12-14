package com.Rigoberto.Aplication.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Roles")
public class Roles implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	// Mapeo de la tabla.
	@Column(name = "rol" , nullable = false, length = 45)
	private String Rol;

	// Constructor vacio.
	protected Roles() {

	}

	// Constructor
	public Roles(long id, String rol) {
		this.id = id;
		this.Rol = rol;
	}
	// Getters and Setters.

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		this.Rol = rol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
