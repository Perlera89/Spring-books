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
@Table(name = "Libro2") // Nombre de la Table
public class Libro2 implements Serializable {
	private static final long serialVersionUID = 9L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_Libro2;
	// Mapeo de la tabla libro2.
	@Column(name = "Nombre_Libro2") // Nombre de la columna
	private String NombreLibro2;
	@Column(name = "Autor2", nullable = false, length = 200) // Nombre de la columna
	private String autor2;
	@Column(name = "Detalle2", nullable = false, length = 5000) // Nombre de la columna
	private String detalle2;
	@Column(name = "PrecioCompra2", nullable = false, length = 25) // Nombre de la columna
	private String precioCompra2;
	@Column(name = "Valor2", nullable = false, length = 25) // Nombre de la columna
	private String valor2;
	@Column(name = "Edicion2", nullable = false, length = 25) // Nombre de la columna
	private String edicion2;
	@Column(name = "Año2") // Nombre de la columna
	private int fecha2;
	@Column(name = "Precio2", nullable = false, length = 20) // Nombre de la columna
	private String precio2;
	@Column(name = "Link2", nullable = false, length = 500) // Nombre de la columna
	private String link2;
	@Column(name = "Foto2", nullable = false, length = 400) // Nombre de la columna
	private String foto2;

	// Constructor vacio
	protected Libro2() {
	}

	// Constructor con parametros
	public Libro2(long IDlibro2, String nombrelibro2, String AUTOR2, String desCripcion2, String pRecio2, String linK2,
			String fotO2, int Fecha2, String Edicion2, String PreciodeCompra2, String Valor2) {
		this.Id_Libro2 = IDlibro2;
		this.NombreLibro2 = nombrelibro2;
		this.autor2 = AUTOR2;
		this.detalle2 = desCripcion2;
		this.precio2 = pRecio2;
		this.link2 = linK2;
		this.foto2 = fotO2;
		this.fecha2 = Fecha2;
		this.edicion2 = Edicion2;
		this.precioCompra2 = PreciodeCompra2;
		this.valor2 = Valor2;
	}
	// Getters and Setters.

	public long getId_Libro2() {
		return Id_Libro2;
	}

	public void setId_Libro2(long id_Libro2) {
		Id_Libro2 = id_Libro2;
	}

	public String getNombreLibro2() {
		return NombreLibro2;
	}

	public void setNombreLibro2(String nombreLibro2) {
		NombreLibro2 = nombreLibro2;
	}

	public String getAutor2() {
		return autor2;
	}

	public void setAutor2(String autor2) {
		this.autor2 = autor2;
	}

	public String getDetalle2() {
		return detalle2;
	}

	public void setDetalle2(String detalle2) {
		this.detalle2 = detalle2;
	}

	public String getPrecioCompra2() {
		return precioCompra2;
	}

	public void setPrecioCompra2(String precioCompra2) {
		this.precioCompra2 = precioCompra2;
	}

	public String getValor2() {
		return valor2;
	}

	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}

	public String getEdicion2() {
		return edicion2;
	}

	public void setEdicion2(String edicion2) {
		this.edicion2 = edicion2;
	}

	public int getFecha2() {
		return fecha2;
	}

	public void setFecha2(int fecha2) {
		this.fecha2 = fecha2;
	}

	public String getPrecio2() {
		return precio2;
	}

	public void setPrecio2(String precio2) {
		this.precio2 = precio2;
	}

	public String getLink2() {
		return link2;
	}

	public void setLink2(String link2) {
		this.link2 = link2;
	}

	public String getFoto2() {
		return foto2;
	}

	public void setFoto2(String foto2) {
		this.foto2 = foto2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}