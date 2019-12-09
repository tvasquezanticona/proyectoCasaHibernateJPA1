package com.project.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.project.entities.Miembrosjovenes;
import com.project.entities.Usuario;
 
public class HibernateUtil {
	
	 private static final SessionFactory sessionFactory = buildSessionFactory();
	    private static final String HIBERNATE_CFG = "hibernate.cfg.xml";

	    private static SessionFactory buildSessionFactory() 
	    {
	        Configuration cfg = new Configuration();
	        //addResource(HIBERNATE_CFG).configure();
	       cfg.addAnnotatedClass(com.project.entities.Usuario.class);
	       cfg.addAnnotatedClass(com.project.entities.Miembrosjovenes.class);
	      cfg.configure();
	        //cfg.addClass(com.project.entities.Usuario.class);
	        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
	                applySettings(cfg.getProperties()).build();
	        SessionFactory sessionFactory = cfg.buildSessionFactory(serviceRegistry);
	        return sessionFactory;
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	

}