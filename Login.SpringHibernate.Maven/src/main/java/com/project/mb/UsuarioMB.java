package com.project.mb;

import java.util.Date;

import javax.faces.bean.ManagedBean;

import org.hibernate.Session;

import com.project.entities.Usuario;
import com.project.utils.HibernateUtil;

@ManagedBean
public class UsuarioMB {
	private String username;
	private Date fechaRegistro;
	

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String password;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String guardarUsuario() {
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Usuario usuario = new Usuario(username, password,fechaRegistro);
		session.save(usuario);
		session.getTransaction().commit();
		session.close();
		
		
		return"Se guardo correectamente";
	}
	

}
