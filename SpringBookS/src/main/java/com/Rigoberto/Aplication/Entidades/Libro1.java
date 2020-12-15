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
@Table(name = "Libro1") // Nombre de la tabla
public class Libro1 implements Serializable {
	private static final long serialVersionUID = 2L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_Libro;
	// Mapeo de la tabla libro1.
	@Column(name = "Nombre_Libro", nullable = false, length = 200) // Nombre de la columna
	private String NombreLibro;
	@Column(name = "Autor", nullable = false, length = 200) // Nombre de la columna
	private String Autor;
	@Column(name = "Detalle", nullable = false, length = 5000) // Nombre de la columna
	private String detalle;
	@Column(name = "PrecioCompra", nullable = false, length = 25) // Nombre de la columna
	private String precioCompra;
	@Column(name = "Valor", nullable = false, length = 25) // Nombre de la columna
	private String valor;
	@Column(name = "Edicion", nullable = false, length = 25) // Nombre de la columna
	private String edicion;
	@Column(name = "Año") // Nombre de la columna
	private int fecha;
	@Column(name = "Precio", nullable = false, length = 20) // Nombre de la columna
	private String precio;
	@Column(name = "Link", nullable = false, length = 500) // Nombre de la columna
	private String link;
	@Column(name = "Foto", nullable = false, length = 400) // Nombre de la columna
	private String foto;

	// Constructor vacio
	protected Libro1() {
	}

	// Constructor con parametros
	public Libro1(long IDlibro, String nombrelibro, String AUTOR, String desCripcion, String pRecio, String linK,
			String fotO, int Fecha, String Edicion, String PrecioCompra, String Valor) {
		this.Id_Libro = IDlibro;
		this.NombreLibro = nombrelibro;
		this.Autor = AUTOR;
		this.detalle = desCripcion;
		this.precio = pRecio;
		this.link = linK;
		this.foto = fotO;
		this.fecha = Fecha;
		this.edicion = Edicion;
		this.precioCompra = PrecioCompra;
		this.valor = Valor;
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

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(String precioCompra) {
		this.precioCompra = precioCompra;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
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
