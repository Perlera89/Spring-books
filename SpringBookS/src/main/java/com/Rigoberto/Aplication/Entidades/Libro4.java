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
@Table(name = "Libro4") // Nombre de la Table
public class Libro4 implements Serializable {
	private static final long serialVersionUID = 11L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_Libro4;
	// Mapeo de la tabla libro2.
	@Column(name = "Nombre_Libro4") // Nombre de la columna
	private String NombreLibro4;
	@Column(name = "Autor4", nullable = false, length = 200) // Nombre de la columna
	private String autor4;
	@Column(name = "Detalle4", nullable = false, length = 5000) // Nombre de la columna
	private String detalle4;
	@Column(name = "Precio4", nullable = false, length = 20) // Nombre de la columna
	private String precio4;
	@Column(name = "Link4", nullable = false, length = 500) // Nombre de la columna
	private String link4;
	@Column(name = "Foto4", nullable = false, length = 400) // Nombre de la columna
	private String foto4;

	// Constructor vacio
	protected Libro4() {
	}

	// Constructor con parametros
	public Libro4(long IDlibro4, String nombrelibro4, String AUTOR4, String desCripcion4, String pRecio4, String linK4,
			String fotO4) {
		this.Id_Libro4 = IDlibro4;
		this.NombreLibro4 = nombrelibro4;
		this.autor4 = AUTOR4;
		this.detalle4 = desCripcion4;
		this.precio4 = pRecio4;
		this.link4 = linK4;
		this.foto4 = fotO4;
	}

	public long getId_Libro4() {
		return Id_Libro4;
	}

	public void setId_Libro4(long id_Libro4) {
		Id_Libro4 = id_Libro4;
	}

	public String getNombreLibro4() {
		return NombreLibro4;
	}

	public void setNombreLibro4(String nombreLibro4) {
		NombreLibro4 = nombreLibro4;
	}

	public String getAutor4() {
		return autor4;
	}

	public void setAutor4(String autor4) {
		this.autor4 = autor4;
	}

	public String getDetalle4() {
		return detalle4;
	}

	public void setDetalle4(String detalle4) {
		this.detalle4 = detalle4;
	}

	public String getPrecio4() {
		return precio4;
	}

	public void setPrecio4(String precio4) {
		this.precio4 = precio4;
	}

	public String getLink4() {
		return link4;
	}

	public void setLink4(String link4) {
		this.link4 = link4;
	}

	public String getFoto4() {
		return foto4;
	}

	public void setFoto4(String foto4) {
		this.foto4 = foto4;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
