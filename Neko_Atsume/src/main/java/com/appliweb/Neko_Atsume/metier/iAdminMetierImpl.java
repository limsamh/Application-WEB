package com.appliweb.Neko_Atsume.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.appliweb.Neko_Atsume.dao.iAdmin;
import com.appliweb.Neko_Atsume.entities.Astuce;
import com.appliweb.Neko_Atsume.entities.Chat;
import com.appliweb.Neko_Atsume.entities.Utilisateur;

@Transactional
public class iAdminMetierImpl implements iAdminMetier {
private iAdmin dao;

	public void setDao(iAdmin dao) {
	this.dao = dao;
}

	public Utilisateur addUser(Utilisateur u) {
		// TODO Auto-generated method stub
		return dao.addUser(u);
	}

	public Chat addChat(Chat c) {
		// TODO Auto-generated method stub
		return dao.addChat(c);
	}

	public Astuce addAstuce(Astuce a, int idChat) {
		// TODO Auto-generated method stub
		return dao.addAstuce(a, idChat);
	}

	public List<Astuce> consulterAstuce(int idChat) {
		// TODO Auto-generated method stub
		return dao.consulterAllAstuce();
	}

	public Chat consulterChat(int idChat) {
		// TODO Auto-generated method stub
		return dao.consulterChat(idChat);
	}

	public Utilisateur consulterUser(int id_user) {
		// TODO Auto-generated method stub
		return dao.consulterUser(id_user);
	}

	public List<Astuce> consulterAstuceUser(int id_user) {
		// TODO Auto-generated method stub
		return dao.consulterAstuceUser(id_user);
	}

	public List<Chat> consulterRareChat() {
		// TODO Auto-generated method stub
		return dao.consulterRareChat();
	}

	public List<Chat> consulterRegChat() {
		// TODO Auto-generated method stub
		return dao.consulterRegChat();
	}

	public List<Chat> consulterAllChat() {
		// TODO Auto-generated method stub
		return dao.consulterAllChat();
	}

	public List<Utilisateur> consulterAllUser() {
		// TODO Auto-generated method stub
		return dao.consulterAllUser();
	}

	public List<Astuce> consulterAllAstuce() {
		// TODO Auto-generated method stub
		return dao.consulterAllAstuce();
	}

}
