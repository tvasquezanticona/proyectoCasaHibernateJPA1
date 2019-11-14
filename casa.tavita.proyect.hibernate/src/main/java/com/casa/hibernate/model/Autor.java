package com.casa.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autor")
public class Autor implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_autor;
	@Column
	private String nombres_autor;
	@Column
	private String apellidos_autor;
	@Column
	private int pais;

	
		
	@Override
	public String toString() {
		return "Autor [id_autor=" + id_autor + ", nombres_autor=" + nombres_autor + ", apellidos_autor="
				+ apellidos_autor + ", pais=" + pais + "]";
	}
	
	
	
	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getNombres_autor() {
		return nombres_autor;
	}
	
	public void setNombres_autor(String nombres_autor) {
		this.nombres_autor = nombres_autor;
	}

	public String getApellidos_autor() {
		return apellidos_autor;
	}

	public void setApellidos_autor(String apellidos_autor) {
		this.apellidos_autor = apellidos_autor;
	}

	public int getPais() {
		return pais;
	}

	public void setPais(int pais) {
		this.pais = pais;
	}

}
