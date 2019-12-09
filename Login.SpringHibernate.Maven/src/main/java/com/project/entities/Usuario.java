package com.project.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private int idUsuario;
		@Column
		private String Username;
		@Column
		private String Password;
		@Column
		private Date fechaRegistro;
		
		
		public Date getFechaRegistro() {
			return fechaRegistro;
		}
		public void setFechaRegistro(Date fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
		}
		public Usuario(String Username, String Password , Date fechaRegistro) {
			this.Username=Username;
			this.Password=Password;
			this.fechaRegistro=fechaRegistro;
			// TODO Auto-generated constructor stub
		}
		public int getIdUsuario() {
			return idUsuario;
		}
		public void setIdUsuario(int idUsuario) {
			this.idUsuario = idUsuario;
		}
		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
	
	
	

	

	
	
}
