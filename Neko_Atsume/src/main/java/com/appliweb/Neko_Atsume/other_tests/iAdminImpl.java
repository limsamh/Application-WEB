package com.appliweb.Neko_Atsume.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.appliweb.Neko_Atsume.entities.Astuce;
import com.appliweb.Neko_Atsume.entities.Chat;
import com.appliweb.Neko_Atsume.entities.Utilisateur;

public class iAdminImpl implements iAdmin {
	@PersistenceContext
    private EntityManager em;
	public Utilisateur addUser(Utilisateur u) {
		em.persist(u);
		return u;
	}

	public Chat addChat(Chat c) {
		em.persist(c);
		return c;
	}

	public Astuce addAstuce(Astuce a, int idChat) {
	if(idChat != 0){
		Astuce b=em.find(Astuce.class, idChat);
		a.setAstuce(b);
	}
	em.persist(a);
		return a;
	}

	public List<Astuce> consulterAstuce(int idChat) {
		Query req =em.createQuery("select o from astuce o where o.astuce.id_chat:=x");
		req.setParameter("x", idChat);
		return req.getResultList();
	}

	public Chat consulterChat(int idChat) {
		Chat c= em.find(Chat.class, idChat);
		if(c ==null) throw new RuntimeException("Chat introuvable!");
		
		return c;
	}

	public Utilisateur consulterUser(int id_user) {
		Utilisateur u= em.find(Utilisateur.class, id_user);
		if(u ==null) throw new RuntimeException("Utilisateur introuvable!");
		
		return u;
	}

	public List<Astuce> consulterAstuceUser(int id_user) {
		Query req =em.createQuery("select o from astuce o where astuce.id_utilisateur like :x");
		req.setParameter("x", "%"+id_user+"%");
		return req.getResultList();
	}

	public List<Chat> consulterRareChat() {
		String rar="Rare cats";
		Query req =em.createQuery("select o from chat o where o.astuce.type_chat:=x");
		req.setParameter("x", rar);
		return req.getResultList();
	}

	public List<Chat> consulterRegChat() {
		String reg="Regular cats";
		Query req =em.createQuery("select o from chat o where o.astuce.type_chat:=x");
		req.setParameter("x", reg);
		return req.getResultList();
	}

	public List<Chat> consulterAllChat() {
		Query req =em.createQuery("select o from chat o");
		return req.getResultList();
	}

	public List<Utilisateur> consulterAllUser() {
		Query req =em.createQuery("select o from utilisateur o ");
		return req.getResultList();
	}

	public List<Astuce> consulterAllAstuce() {
		Query req =em.createQuery("select o from astuce o ");
		return req.getResultList();
	}

}
