package com.isg.laidsoa.entities;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor

@Entity
public class CV {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idcv;


    @NonNull
    String Nom;
    @NonNull
    String Prenom;
    @Lob
    byte [] photo;
    String tweeter;
    String facebook;



   @OneToOne
    private Candidat candid;

    public CV(long idcv, @NonNull String nom, @NonNull String prenom, byte[] photo, String tweeter, String facebook) {
        this.idcv = idcv;
        Nom = nom;
        Prenom = prenom;
        this.photo = photo;
        this.tweeter = tweeter;
        this.facebook = facebook;
    }

    public CV() {

    }
}
