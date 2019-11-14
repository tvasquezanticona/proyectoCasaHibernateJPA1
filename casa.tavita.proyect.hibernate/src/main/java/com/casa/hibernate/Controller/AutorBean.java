package com.casa.hibernate.Controller;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.casa.hibernate.dao.AutorDAO;
import com.casa.hibernate.model.Autor;

@ManagedBean(name="autorBean")
@RequestScoped
public class AutorBean implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String nuevo() {
		
		
		
		return "nuevo.xhtml";
	}
	
	
	
		public List<Autor> obtenerAutores(){
			AutorDAO autorDAO = new AutorDAO();
			
			
			/*List<Autor> listaAutores= new ArrayList<Autor>();
			Autor a1 = new Autor();
			a1.setId_autor(7);
			a1.setNombres_autor("Tavita");
			a1.setApellidos_autor("Vasquez");
			a1.setPais(2);
			
			Autor a2 = new Autor();
			a2.setId_autor(8);
			a2.setNombres_autor("Pedro");
			a2.setApellidos_autor("Jorge");
			a2.setPais(2);
			
			listaAutores.add(a1);
			listaAutores.add(a2);*/
			return autorDAO.obtenerAutores();
		}
		
		public String editar(int id) {
			AutorDAO autorDAO = new AutorDAO();
			Autor a=new  Autor();
			a=autorDAO.buscar(id);
			//System.out.println(a);
			//System.out.println();
			//Crear Colecciones de Tipo Sessions
		Map<String,Object> sessionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("autor", a);
		//SessionMap lo pasamos por metodo PUT(parameters String == nOMBRE DE NUESTRA BEAN VISTA)
		//sessionMap.put("autor", a);
		return "editar.xhtml";
			
		}
		public String actualizar(Autor autor) {
			System.out.println("Imprimiendo metodo Actualizar Data de autor"+autor);
			//guarda la fecha de actualizacion
			//Date fechaActual= new Date();
			//cliente.setFactualizar(new java.sql.Date(fechaActual.getTime()));
			System.out.println("Ejecuto el metodo editar AutorDAO");
			AutorDAO clienteDAO = new AutorDAO();
			clienteDAO.editar(autor);
			return "index.xhtml";
		}
		
		public String eliminar(int id) {
			AutorDAO autorDAO = new AutorDAO();
			autorDAO.eliminar(id);
			System.out.println("Cliente Eliminado..");
			
			return "index.xhtml";
			
		}
		
		
		/*public String actualizar(Autor autor) {
			System.out.println("Imprimiendo metodo Actualizar Data de autor"+autor);
			AutorDAO autorDAO = new AutorDAO();
			autorDAO.editar(autor);
			System.out.println("Ejecuto el metodo editar AutorDAO");
			return "/faces/index.xhtml";
			
		}*/
		
		
		
		
		
		
		
}
