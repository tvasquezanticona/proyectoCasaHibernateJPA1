package com.casa.hibernate.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.casa.hibernate.model.Autor;
import com.casa.hibernate.model.JPAUtil;

public class AutorDAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	public void guardar(Autor autor) {
		
		entity.getTransaction().begin();
		entity.persist(autor);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}
	
	
	public void editar(Autor autor)
	{
		entity.getTransaction().begin();
		entity.merge(autor);
		entity.getTransaction().commit();
		
	}
	
	public Autor buscar(int id) {
		Autor a = new Autor();
		a=entity.find(Autor.class,id);
		//JPAUtil.shutdown();
		
		
		return a;
		
	}
	
	public List<Autor> obtenerAutores(){
		List<Autor> listaAutores= new ArrayList<>();
		Query q=entity.createQuery("SELECT a FROM Autor a");
		listaAutores=q.getResultList();
		return listaAutores;
		
	}
	
	public void eliminar(int id) {
		Autor a = new Autor();
		a=entity.find(Autor.class,id);
		entity.getTransaction().begin();
		entity.remove(a);
		entity.getTransaction().commit();
	}
	
	
	
	
	
	
	
	
	
	
}
