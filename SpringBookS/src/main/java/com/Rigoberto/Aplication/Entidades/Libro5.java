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
public class Libro5 implements Serializable{
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
				String fotO5) {
			this.Id_Libro5 = IDlibro5;
			this.NombreLibro5 = nombrelibro5;
			this.autor5 = AUTOR5;
			this.detalle5 = desCripcion5;
			this.precio5 = pRecio5;
			this.link5 = linK5;
			this.foto5 = fotO5;
		}

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
