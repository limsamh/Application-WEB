package com.neko.model;
// Generated 2 avr. 2016 23:23:44 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Chat generated by hbm2java
 */
@Entity
@Table(name = "chat", catalog = "chatbd")
public class Chat implements java.io.Serializable {

	private String nomChat;
	private Compte compte;
	private String nomJaponais;
	private String description;
	private String caractere;
	private int niveau;
	private String image;
	private int typeChat;
	private Set<Astuces> astuceses = new HashSet<Astuces>(0);

	public Chat() {
	}

	public Chat(String nomChat, String nomJaponais, String description, String caractere, int niveau, String image,
			int typeChat) {
		this.nomChat = nomChat;
		this.nomJaponais = nomJaponais;
		this.description = description;
		this.caractere = caractere;
		this.niveau = niveau;
		this.image = image;
		this.typeChat = typeChat;
	}

	public Chat(String nomChat, Compte compte, String nomJaponais, String description, String caractere, int niveau,
			String image, int typeChat, Set<Astuces> astuceses) {
		this.nomChat = nomChat;
		this.compte = compte;
		this.nomJaponais = nomJaponais;
		this.description = description;
		this.caractere = caractere;
		this.niveau = niveau;
		this.image = image;
		this.typeChat = typeChat;
		this.astuceses = astuceses;
	}

	@Id

	@Column(name = "nom_chat", unique = true, nullable = false, length = 30)
	public String getNomChat() {
		return this.nomChat;
	}

	public void setNomChat(String nomChat) {
		this.nomChat = nomChat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "login")
	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Column(name = "nom_japonais", nullable = false, length = 30)
	public String getNomJaponais() {
		return this.nomJaponais;
	}

	public void setNomJaponais(String nomJaponais) {
		this.nomJaponais = nomJaponais;
	}

	@Column(name = "description", nullable = false, length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "caractere", nullable = false, length = 40)
	public String getCaractere() {
		return this.caractere;
	}

	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}

	@Column(name = "niveau", nullable = false)
	public int getNiveau() {
		return this.niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	@Column(name = "image", nullable = false, length = 40)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "type_chat", nullable = false)
	public int getTypeChat() {
		return this.typeChat;
	}

	public void setTypeChat(int typeChat) {
		this.typeChat = typeChat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chat")
	public Set<Astuces> getAstuceses() {
		return this.astuceses;
	}

	public void setAstuceses(Set<Astuces> astuceses) {
		this.astuceses = astuceses;
	}

}