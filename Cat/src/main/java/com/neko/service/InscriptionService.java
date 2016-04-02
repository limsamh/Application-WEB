package com.neko.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.neko.model.Compte;
import com.neko.util.HibernateUtil;
public class InscriptionService 
{
	
	public boolean utilisateurexist(Compte user)
	{
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();
			
			Query sql =session.createQuery("from Compte where login ='"+user.getLogin()+"'");
			Compte ut = (Compte)sql.uniqueResult();
			tx.commit();
			if (ut!=null)
			{
				result = true;
			}
		}catch (Exception ex)
		{
			if (tx !=null)
			{
				tx.rollback();
			}
		}finally {
			session.close();
		}
		
			return result;
	}
	
	public boolean enregistrer (Compte user)
	{
		Session session = HibernateUtil.openSession();
		
		if (utilisateurexist(user))
		{
			return false;
		}
		
		Transaction tx = null;
		
		try {
				tx = session.getTransaction();
				tx.begin();
				session.saveOrUpdate(user);
				tx.commit();
			} catch (Exception e) 
		{
			if (tx !=null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return true;
	}
	
	
}
