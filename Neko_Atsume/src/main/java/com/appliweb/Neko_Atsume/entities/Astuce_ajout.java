package com.appliweb.Neko_Atsume.entities;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("AJT")
public class Astuce_ajout extends Astuce {

	public Astuce_ajout() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Astuce_ajout(Chat chat, Compte compte, String contenu, String typeModif) {
		super(chat, compte, contenu, typeModif);
		// TODO Auto-generated constructor stub
	}


	
	

}
