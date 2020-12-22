package com.isg.laidsoa.entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class partie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_partie;

    private String nom_partie;

    public partie(long id_partie, String nom_partie) {
        this.id_partie = id_partie;
        this.nom_partie = nom_partie;
    }

    public partie() {

    }

    public long getId_partie() {
        return id_partie;
    }

    public void setId_partie(long id_partie) {
        this.id_partie = id_partie;
    }

    public String getNom_partie() {
        return nom_partie;
    }

    public void setNom_partie(String nom_partie) {
        this.nom_partie = nom_partie;
    }
/*
 @OneToMany(mappedBy = "idc",cascade = CascadeType.ALL)
    Set<Candidat> ListCandidat=new HashSet<>();*/

    /*@OneToOne
    private liste_partisienne liste_partisienne ;*/

    /*@ManyToOne
    @JoinColumn(name="Id_Liste_Coalition",referencedColumnName = "id_coalition")
    private  liste_coalition liste_coalition; */

}