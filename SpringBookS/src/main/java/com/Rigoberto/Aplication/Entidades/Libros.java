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
@Table(name = "Libros")
public class Libros implements Serializable {
	private static final long serialVersionUID = 2L;
	// Generacion automatica del id.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	private long Id_Libro;
	// Mapeo de las tablas de las bases de datos.
	@Column(name = "Nombre_Libro", nullable = false, length = 200)
	private String NombreLibro;
	@Column(name = "Descripcion", nullable = false, length = 5000)
	private String descripcion;
	@Column(name = "Precio", nullable = false, length = 20)
	private String precio;
	@Column(name = "Link", nullable = false, length = 500)
	private String link;
	@Column(name = "Foto", nullable = false, length = 400)
	private String foto;

	// Constructor vacio
	protected Libros() {
	}

	// Constructor
	public Libros(long IDlibro, String nombrelibro, String desCripcion, String pRecio, String linK, String fotO) {
		this.Id_Libro = IDlibro;
		this.NombreLibro = nombrelibro;
		this.descripcion = desCripcion;
		this.precio = pRecio;
		this.link = linK;
		this.foto = fotO;
	}

	// Getters and Setters.
	public long getId_Libro() {
		return Id_Libro;
	}

	public void setId_Libro(long id_Libro) {
		Id_Libro = id_Libro;
	}

	public String getNombreLibro() {
		return NombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		NombreLibro = nombreLibro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
