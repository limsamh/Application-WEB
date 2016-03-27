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
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name="utilisateur"
    ,catalog="neko"
)
public class Utilisateur  implements java.io.Serializable {


     private Integer idUtilisateur;
     private TypeUtilisateur typeUtilisateur;
     private String pseudo;
     private String motDePasse;
     private Set chats = new HashSet(0);
     private Set astuces = new HashSet(0);

    public Utilisateur() {
    }

	
    public Utilisateur(TypeUtilisateur typeUtilisateur, String pseudo, String motDePasse) {
        this.typeUtilisateur = typeUtilisateur;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
    }
    public Utilisateur(TypeUtilisateur typeUtilisateur, String pseudo, String motDePasse, Set chats, Set astuces) {
       this.typeUtilisateur = typeUtilisateur;
       this.pseudo = pseudo;
       this.motDePasse = motDePasse;
       this.chats = chats;
       this.astuces = astuces;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_utilisateur", unique=true, nullable=false)
    public Integer getIdUtilisateur() {
        return this.idUtilisateur;
    }
    
    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_type", nullable=false)
    public TypeUtilisateur getTypeUtilisateur() {
        return this.typeUtilisateur;
    }
    
    public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    
    @Column(name="pseudo", nullable=false, length=30)
    public String getPseudo() {
        return this.pseudo;
    }
    
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    
    @Column(name="mot_de_passe", nullable=false, length=30)
    public String getMotDePasse() {
        return this.motDePasse;
    }
    
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public Set getChats() {
        return this.chats;
    }
    
    public void setChats(Set chats) {
        this.chats = chats;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public Set getAstuces() {
        return this.astuces;
    }
    
    public void setAstuces(Set astuces) {
        this.astuces = astuces;
    }




}


