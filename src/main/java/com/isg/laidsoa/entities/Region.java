package com.isg.laidsoa.entities;

import lombok.NonNull;

import javax.persistence.*;


@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_region;

    @NonNull

    private String nom_region;


   /* @ManyToOne
    @JoinColumn(name="Id_list_presidentiel",referencedColumnName = "id_list_pres")
    private liste_presidentielle list_prs;*/

    public Region(int id_region, @NonNull String nom_region) {
        this.id_region = id_region;
        this.nom_region = nom_region;

    }

    public Region() {

    }
}
