package com.neko.util;

import javax.servlet.jsp.tagext.TryCatchFinally;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static  SessionFactory sessioFactory;
	public HibernateUtil() {
		// TODO Auto-generated constructor stub
	try {
		
	 Configuration configuration = new Configuration().configure();
		
		 StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		 
		 sessioFactory= configuration.buildSessionFactory(builder.build());

		// sessioFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	} catch (Throwable e) 
	{
		System.err.println("Initial SessionFactory creation failed." + e);
		throw new ExceptionInInitializerError(e);
	}
}
	
	public static Session openSession()
	{
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session session = sessionFactory.openSession();
		    
		    return session;
	}
}
