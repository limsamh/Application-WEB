package com.appliweb.Neko_Atsume.entities;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("SUP")
public class Astuce_suppr extends Astuce {

	public Astuce_suppr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Astuce_suppr(Chat chat, Compte compte, String contenu, String typeModif) {
		super(chat, compte, contenu, typeModif);
		// TODO Auto-generated constructor stub
	}


}
