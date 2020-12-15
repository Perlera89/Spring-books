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
@Table(name = "Libro5") // Nombre de la Table
public class Libro5 implements Serializable {
	private static final long serialVersionUID = 12L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_Libro5;
	// Mapeo de la tabla libro2.
	@Column(name = "Nombre_Libro5") // Nombre de la columna
	private String NombreLibro5;
	@Column(name = "Autor5", nullable = false, length = 200) // Nombre de la columna
	private String autor5;
	@Column(name = "Detalle5", nullable = false, length = 5000) // Nombre de la columna
	private String detalle5;
	@Column(name = "PrecioCompra5", nullable = false, length = 25) // Nombre de la columna
	private String precioCompra5;
	@Column(name = "Valor5", nullable = false, length = 25) // Nombre de la columna
	private String valor5;
	@Column(name = "Edicion5", nullable = false, length = 25) // Nombre de la columna
	private String edicion5;
	@Column(name = "Año5") // Nombre de la columna
	private int fecha5;
	@Column(name = "Precio5", nullable = false, length = 20) // Nombre de la columna
	private String precio5;
	@Column(name = "Link5", nullable = false, length = 500) // Nombre de la columna
	private String link5;
	@Column(name = "Foto5", nullable = false, length = 400) // Nombre de la columna
	private String foto5;

	// Constructor vacio
	protected Libro5() {
	}

	// Constructor con parametros
	public Libro5(long IDlibro5, String nombrelibro5, String AUTOR5, String desCripcion5, String pRecio5, String linK5,
			String fotO5, int Fecha5, String Edicion5, String PreciodeCompra5, String Valor5) {
		this.Id_Libro5 = IDlibro5;
		this.NombreLibro5 = nombrelibro5;
		this.autor5 = AUTOR5;
		this.detalle5 = desCripcion5;
		this.precio5 = pRecio5;
		this.link5 = linK5;
		this.foto5 = fotO5;
		this.fecha5 = Fecha5;
		this.edicion5 = Edicion5;
		this.precioCompra5 = PreciodeCompra5;
		this.valor5 = Valor5;
	}
	// Getters and Setters.

	public long getId_Libro5() {
		return Id_Libro5;
	}

	public void setId_Libro5(long id_Libro5) {
		Id_Libro5 = id_Libro5;
	}

	public String getNombreLibro5() {
		return NombreLibro5;
	}

	public void setNombreLibro5(String nombreLibro5) {
		NombreLibro5 = nombreLibro5;
	}

	public String getAutor5() {
		return autor5;
	}

	public void setAutor5(String autor5) {
		this.autor5 = autor5;
	}

	public String getDetalle5() {
		return detalle5;
	}

	public void setDetalle5(String detalle5) {
		this.detalle5 = detalle5;
	}

	public String getPrecioCompra5() {
		return precioCompra5;
	}

	public void setPrecioCompra5(String precioCompra5) {
		this.precioCompra5 = precioCompra5;
	}

	public String getValor5() {
		return valor5;
	}

	public void setValor5(String valor5) {
		this.valor5 = valor5;
	}

	public String getEdicion5() {
		return edicion5;
	}

	public void setEdicion5(String edicion5) {
		this.edicion5 = edicion5;
	}

	public int getFecha5() {
		return fecha5;
	}

	public void setFecha5(int fecha5) {
		this.fecha5 = fecha5;
	}

	public String getPrecio5() {
		return precio5;
	}

	public void setPrecio5(String precio5) {
		this.precio5 = precio5;
	}

	public String getLink5() {
		return link5;
	}

	public void setLink5(String link5) {
		this.link5 = link5;
	}

	public String getFoto5() {
		return foto5;
	}

	public void setFoto5(String foto5) {
		this.foto5 = foto5;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
