package projet.neko.model;
// Generated 27 mars 2016 17:00:36 by Hibernate Tools 4.3.1


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
 * Chat generated by hbm2java
 */
@Entity
@Table(name="chat"
    ,catalog="neko"
)
public class Chat  implements java.io.Serializable {


     private Integer idChat;
     private Utilisateur utilisateur;
     private String nomChat;
     private String nomJaponnais;
     private String couleur;
     private int niveau;
     private String caractere;
     private Set astuces = new HashSet(0);

    public Chat() {
    }

	
    public Chat(String nomChat, String nomJaponnais, String couleur, int niveau, String caractere) {
        this.nomChat = nomChat;
        this.nomJaponnais = nomJaponnais;
        this.couleur = couleur;
        this.niveau = niveau;
        this.caractere = caractere;
    }
    public Chat(Utilisateur utilisateur, String nomChat, String nomJaponnais, String couleur, int niveau, String caractere, Set astuces) {
       this.utilisateur = utilisateur;
       this.nomChat = nomChat;
       this.nomJaponnais = nomJaponnais;
       this.couleur = couleur;
       this.niveau = niveau;
       this.caractere = caractere;
       this.astuces = astuces;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_chat", unique=true, nullable=false)
    public Integer getIdChat() {
        return this.idChat;
    }
    
    public void setIdChat(Integer idChat) {
        this.idChat = idChat;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_utilisateur")
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    
    @Column(name="nom_chat", nullable=false, length=30)
    public String getNomChat() {
        return this.nomChat;
    }
    
    public void setNomChat(String nomChat) {
        this.nomChat = nomChat;
    }

    
    @Column(name="nom_japonnais", nullable=false, length=30)
    public String getNomJaponnais() {
        return this.nomJaponnais;
    }
    
    public void setNomJaponnais(String nomJaponnais) {
        this.nomJaponnais = nomJaponnais;
    }

    
    @Column(name="couleur", nullable=false, length=20)
    public String getCouleur() {
        return this.couleur;
    }
    
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    
    @Column(name="niveau", nullable=false)
    public int getNiveau() {
        return this.niveau;
    }
    
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    
    @Column(name="caractere", nullable=false, length=65535)
    public String getCaractere() {
        return this.caractere;
    }
    
    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="chat")
    public Set getAstuces() {
        return this.astuces;
    }
    
    public void setAstuces(Set astuces) {
        this.astuces = astuces;
    }




}


