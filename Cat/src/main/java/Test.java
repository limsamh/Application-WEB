import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.neko.model.Utilisateur;
import com.neko.util.HibernateUtil;

import java.util.*;
public class Test {

	public static void main(String[] args) 
	{
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session session = sessionFactory.openSession();
		    
		    try {
		    	List<Utilisateur> result = (List<Utilisateur>) session.createQuery("from Utilisateur").list();
		    
		    	System.out.println(result.get(0).getLogin());
		     
		    }
		    
		    catch (Exception e)
		    {
		    	System.out.println("blablabalablab"+e.getMessage());
		    }
		    
		    finally {
		      session.close();
		    }

		    sessionFactory.close();
		  }
	}
