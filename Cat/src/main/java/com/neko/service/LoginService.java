package com.neko.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.neko.model.Utilisateur;
import com.neko.util.HibernateUtil;
public class LoginService 
{
	
	public Utilisateur recupererUtilisateur(String login)
	{
		
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		Utilisateur user = null;
		
		try{
			
			Query sql = session.createQuery("from Utilisateur where login='"+login+"'");
			
			user = (Utilisateur) sql.uniqueResult();
			tx.commit();
		} 
		catch (Exception e)
		{
			if (tx !=null)
			{
				tx.rollback();
			}
			
			
		}finally {
			session.close();
		}
		
		return user;
	}
	
	
	public boolean seconnecter (String login, String motdepasse)
	{
		Utilisateur user =recupererUtilisateur(login);
		
		if (user != null && user.getLogin().equals(login) && user.getModepasse().equals(motdepasse))
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void inscription()
	{
		
	}
}
