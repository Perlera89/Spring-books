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
@Table(name = "Categorias")
public class Categorias implements Serializable {
	private static final long serialVersionUID = 3L;
	// Generacion automatica del id.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Generacion automatica del id.
	private long Id_Categorias;
	// Mapeo de las tablas de las bases de datos.
	@Column(name = "Nombre_Categoria", nullable = false, length = 50)
	private String Nombre_categoria;

	// Constructor vacio
	protected Categorias() {
	}

	// Constructor
	public Categorias(long IdCategorias, String NombreCategoria) {
		this.Id_Categorias = IdCategorias;
		this.Nombre_categoria = NombreCategoria;
	}

	// Getters And setters.
	public long getId_Categorias() {
		return Id_Categorias;
	}

	public void setId_Categorias(long id_Categorias) {
		Id_Categorias = id_Categorias;
	}

	public String getNombreCategoria() {
		return Nombre_categoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.Nombre_categoria = nombreCategoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
