import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.neko.model.Utilisateur;
import com.neko.util.HibernateUtil;

import java.util.*;

import javax.crypto.Cipher;
public class Test {

	
	public  String encrypt(String password,String key){
		try
		{
			Key clef = new SecretKeySpec(key.getBytes("ISO-8859-2"),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE,clef);
			return new String(cipher.doFinal(password.getBytes()));
		}
		catch (Exception e)
		{
		return null;
		}
		}
	
	public static decrypt(String password,String key){
		try
		{
	
		Key clef = new SecretKeySpec(key.getBytes("ISO-8859-2"),"Blowfish");
		Cipher cipher=Cipher.getInstance("Blowfish");
		cipher.init(Cipher.DECRYPT_MODE,clef);
		return new String(cipher.doFinal(password.getBytes()));
		}
		catch (Exception e)
		{
		System.out.println(e);
		return null;
		}
		}
	
	
	public static void main(String[] args) 
	{
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		    Session session = sessionFactory.openSession();
		    
		    try {
		    	List<Utilisateur> result = (List<Utilisateur>) session.createQuery("from Utilisateur").list();
		    
		    	System.out.println(result.get(0).getLogin());
		    	System.out.println(decrypt("toot", "lol"));
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
