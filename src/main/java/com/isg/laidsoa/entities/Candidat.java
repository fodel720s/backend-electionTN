package com.isg.laidsoa.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter

@Entity
public class Candidat  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Code_C;
    private String nom;

    private String prenom;
private LocalDate Birthday;
    private String rank_List;

    @Lob
    private byte[] photo;

   @NonNull
    private String typelist;
    @NonNull
    private boolean appartientpartie;

    private String fb_link;
    private String twe_link;
    private float score_candidat;

  /*  @OneToMany(mappedBy="HisCandidat_act",cascade=CascadeType.ALL)
    private Set<Activite> activites=new HashSet<>();



    @OneToMany(mappedBy="HisCandidat_for",cascade=CascadeType.ALL)
    private Set<Formation> formations=new HashSet<>(); */


 /*  @OneToMany(mappedBy="HisCandidat_reclamation",cascade=CascadeType.ALL)
 private Set<Avis>Avis=new HashSet<>();*/

    public Candidat(String nom, String prenom, LocalDate DateNais, String Profession, String nom1, String prenom1, String rank_List, byte[] photo, String fb_link, String twe_link) {
        this.nom = nom1;
        this.prenom = prenom1;
        this.rank_List = rank_List;
        this.photo = photo;
        this.fb_link= fb_link;
        this.twe_link = twe_link;
    }


    public Candidat() {

    }

    public long getCode_C() {
        return Code_C;
    }

    public void setCode_C(long code_C) {
        Code_C = code_C;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }

    public String getRank_List() {
        return rank_List;
    }

    public void setRank_List(String rank_List) {
        this.rank_List = rank_List;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getTypelist() {
        return typelist;
    }

    public void setTypelist(String typelist) {
        this.typelist = typelist;
    }

    public boolean isAppartientpartie() {
        return appartientpartie;
    }

    public void setAppartientpartie(boolean appartientpartie) {
        this.appartientpartie = appartientpartie;
    }

    public String getFb_link() {
        return fb_link;
    }

    public void setFb_link(String fb_link) {
        this.fb_link = fb_link;
    }

    public String getTwe_link() {
        return twe_link;
    }

    public void setTwe_link(String twe_link) {
        this.twe_link = twe_link;
    }

    public float getScore_candidat() {
        return score_candidat;
    }

    public void setScore_candidat(float score_candidat) {
        this.score_candidat = score_candidat;
    }
}
