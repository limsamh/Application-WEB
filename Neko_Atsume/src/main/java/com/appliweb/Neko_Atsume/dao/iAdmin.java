package com.appliweb.Neko_Atsume.dao;

import java.util.List;

import com.appliweb.Neko_Atsume.entities.Astuce;
import com.appliweb.Neko_Atsume.entities.Chat;
import com.appliweb.Neko_Atsume.entities.Utilisateur;

public interface iAdmin {
   
	public Utilisateur addUser(Utilisateur u);
	public Chat addChat(Chat c);
	public Astuce addAstuce(Astuce a,int idChat);
   public List<Astuce> consulterAstuce(int idChat);
   public Chat consulterChat(int idChat);
   public Utilisateur consulterUser(int id_user);
   public List<Astuce> consulterAstuceUser(int id_user);
   public List<Chat> consulterRareChat();
   public List<Chat> consulterRegChat();
   public List<Chat> consulterAllChat();
   public List<Utilisateur> consulterAllUser();
   public List<Astuce> consulterAllAstuce();
}
