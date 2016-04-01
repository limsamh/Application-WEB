package com.neko.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.neko.model.Chat;
import com.neko.model.Utilisateur;
import com.neko.util.HibernateUtil;

public abstract class ChatDaoImpl implements ChatDAO 
{
	
	Session session = HibernateUtil.openSession();

	@Override
	public List<Chat> getAllcat() 
	{
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		tx.commit();
	
		return session.createQuery("from Chat").list();
		
	}

}
