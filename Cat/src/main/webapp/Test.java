import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.neko.model.Utilisateur;
import com.neko.util.HibernateUtil;
import java.security.Key;

import java.util.*;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/**
 * 
 * Classe permettant de faire un cryptage grace à Blowfish
 *
 */
public class Test {

	/**
	 * Methode permettant de faire un cryptage  de mot de passe grâce  une clé
	 * @param password
	 * @param key
	 * @return
	 */
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
	/**
	 * Methode permettant de décrypter un  mot de passe grâce  une clé
	 * @param password
	 * @param key
	 */
	public static String decrypt(String password,String key){
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

	/**
	 * Methode de test/ point d'entrée du programme
	 * @param args
	 */
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {
			List<Utilisateur> result = (List<Utilisateur>) session.createQuery("from Utilisateur").list();

			System.out.println(result.get(0).getIdutilisateur());
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
