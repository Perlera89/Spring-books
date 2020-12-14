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
	private long Id_user;
	// Mapeo de las tablas de las bases de datos.
	@Column(name = "username", nullable = false, length = 50)
	private String Username;
	@Column(name = "email", nullable = false, length = 50)
	private String Email;
	@Column(name = "password", nullable = false, length = 50)
	private String Password;

	// Constructor vacio
	protected Usuario() {
	}
	// Constructor

	public Usuario(Integer Idsuario, String Nombreusuario, String emaIl, String Contraseña) {
		this.Id_user = Idsuario;
		this.Username = Nombreusuario;
		this.Email = emaIl;
		this.Password = Contraseña;
	}
	// Getters and Setters.

	public long getId_user() {
		return Id_user;
	}

	public void setId_user(long id_user) {
		Id_user = id_user;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
