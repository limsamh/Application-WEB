package com.appliweb.Neko_Atsume.entities;
// Generated 31 mars 2016 05:18:15 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Compte generated by hbm2java
 */
@Entity
@Table(name = "compte", catalog = "neko")
public class Compte implements java.io.Serializable {

	private Integer idCompte;
	private Chat chat;
	private Utilisateur utilisateur;
	private Set<Astuce> astuces = new HashSet<Astuce>(0);

	public Compte() {
	}

	public Compte(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Compte(Chat chat, Utilisateur utilisateur, Set<Astuce> astuces) {
		this.chat = chat;
		this.utilisateur = utilisateur;
		this.astuces = astuces;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_compte", unique = true, nullable = false)
	public Integer getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_chat")
	public Chat getChat() {
		return this.chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "login", nullable = false)
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compte")
	public Set<Astuce> getAstuces() {
		return this.astuces;
	}

	public void setAstuces(Set<Astuce> astuces) {
		this.astuces = astuces;
	}

}