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
@Table(name = "Libro3") // Nombre de la Table
public class Libro3 implements Serializable {
	private static final long serialVersionUID = 10L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_Libro3;
	// Mapeo de la tabla libro2.
	@Column(name = "Nombre_Libro3") // Nombre de la columna
	private String NombreLibro3;
	@Column(name = "Autor3", nullable = false, length = 200) // Nombre de la columna
	private String autor3;
	@Column(name = "Detalle3", nullable = false, length = 5000) // Nombre de la columna
	private String detalle3;
	@Column(name = "PrecioCompra3", nullable = false, length = 25) // Nombre de la columna
	private String precioCompra3;
	@Column(name = "Valor3", nullable = false, length = 25) // Nombre de la columna
	private String valor3;
	@Column(name = "Edicion3", nullable = false, length = 25) // Nombre de la columna
	private String edicion3;
	@Column(name = "Año3") // Nombre de la columna
	private int fecha3;
	@Column(name = "Precio3", nullable = false, length = 20) // Nombre de la columna
	private String precio3;
	@Column(name = "Link3", nullable = false, length = 500) // Nombre de la columna
	private String link3;
	@Column(name = "Foto3", nullable = false, length = 400) // Nombre de la columna
	private String foto3;

	// Constructor vacio
	protected Libro3() {
	}

	// Constructor con parametros
	public Libro3(long IDlibro3, String nombrelibro3, String AUTOR3, String desCripcion3, String pRecio3, String linK3,
			String fotO3, int Fecha3, String Edicion3, String PreciodeCompra3, String Valor3) {
		this.Id_Libro3 = IDlibro3;
		this.NombreLibro3 = nombrelibro3;
		this.autor3 = AUTOR3;
		this.detalle3 = desCripcion3;
		this.precio3 = pRecio3;
		this.link3 = linK3;
		this.foto3 = fotO3;
		this.fecha3 = Fecha3;
		this.edicion3 = Edicion3;
		this.precioCompra3 = PreciodeCompra3;
		this.valor3 = Valor3;
	}
	// Getters and Setters.

	public long getId_Libro3() {
		return Id_Libro3;
	}

	public void setId_Libro3(long id_Libro3) {
		Id_Libro3 = id_Libro3;
	}

	public String getNombreLibro3() {
		return NombreLibro3;
	}

	public void setNombreLibro3(String nombreLibro3) {
		NombreLibro3 = nombreLibro3;
	}

	public String getAutor3() {
		return autor3;
	}

	public void setAutor3(String autor3) {
		this.autor3 = autor3;
	}

	public String getDetalle3() {
		return detalle3;
	}

	public void setDetalle3(String detalle3) {
		this.detalle3 = detalle3;
	}

	public String getPrecioCompra3() {
		return precioCompra3;
	}

	public void setPrecioCompra3(String precioCompra3) {
		this.precioCompra3 = precioCompra3;
	}

	public String getValor3() {
		return valor3;
	}

	public void setValor3(String valor3) {
		this.valor3 = valor3;
	}

	public String getEdicion3() {
		return edicion3;
	}

	public void setEdicion3(String edicion3) {
		this.edicion3 = edicion3;
	}

	public int getFecha3() {
		return fecha3;
	}

	public void setFecha3(int fecha3) {
		this.fecha3 = fecha3;
	}

	public String getPrecio3() {
		return precio3;
	}

	public void setPrecio3(String precio3) {
		this.precio3 = precio3;
	}

	public String getLink3() {
		return link3;
	}

	public void setLink3(String link3) {
		this.link3 = link3;
	}

	public String getFoto3() {
		return foto3;
	}

	public void setFoto3(String foto3) {
		this.foto3 = foto3;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
