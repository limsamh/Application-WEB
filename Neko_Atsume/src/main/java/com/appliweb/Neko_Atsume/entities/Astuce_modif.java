package com.appliweb.Neko_Atsume.entities;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("MOD")
public class Astuce_modif extends Astuce {

	public Astuce_modif() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Astuce_modif(Chat chat, Compte compte, String contenu, String typeModif) {
		super(chat, compte, contenu, typeModif);
		// TODO Auto-generated constructor stub
	}


}
