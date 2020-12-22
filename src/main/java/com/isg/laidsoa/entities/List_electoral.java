package com.isg.laidsoa.entities;

import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class List_electoral implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_list;

    @NonNull
    private String nom_list;

    @NonNull
    private Date date_list;


  /*  @OneToMany(mappedBy="hisList",cascade=CascadeType.ALL)
    private Set<Candidat>candidats=new HashSet<>();*/

    public List_electoral(Long id_list, @NonNull String nom_list, @NonNull Date date_list, Set<Candidat> candidats) {
        this.id_list = id_list;
        this.nom_list = nom_list;
        this.date_list = date_list;
      //  this.candidats = candidats;
    }

    public List_electoral() {

    }

    public Long getId_list() {
        return id_list;
    }

    public void setId_list(Long id_list) {
        this.id_list = id_list;
    }

    public String getNom_list() {
        return nom_list;
    }

    public void setNom_list(String nom_list) {
        this.nom_list = nom_list;
    }

    public Date getDate_list() {
        return date_list;
    }

    public void setDate_list(Date date_list) {
        this.date_list = date_list;
    }

   /* public Set<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(Set<Candidat> candidats) {
        this.candidats = candidats;
    }*/
}
