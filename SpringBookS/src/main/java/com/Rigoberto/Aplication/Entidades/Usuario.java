package com.Rigoberto.Aplication.Entidades;

import java.io.Serializable;

//Importaciones.
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 4L;
	// Generacion automatica del id.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_Usuario;
	// Mapeo de las tablas de las bases de datos.
	@Column(name = "Nombre_Usuario", nullable = false, length = 50)
	private String NombreUsuario;
	@Column(name = "Email", nullable = false, length = 50)
	private String email;
	@Column(name = "Contraseña", nullable = false, length = 50)
	private String contraseña;

	// Constructor vacio
	protected Usuario() {
	}
	// Constructor

	public Usuario(Integer IDUsuario, String Nombreusuario, String emaIl, String cOntraseña) {
		this.Id_Usuario = IDUsuario;
		this.NombreUsuario = Nombreusuario;
		this.email = emaIl;
		this.contraseña = cOntraseña;
	}

//Getters and Setters.    
	public long getId_Usuario() {
		return Id_Usuario;
	}

	public void setId_Usuario(long id_Usuario) {
		Id_Usuario = id_Usuario;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
