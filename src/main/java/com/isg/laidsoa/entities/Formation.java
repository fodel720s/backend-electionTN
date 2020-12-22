package com.isg.laidsoa.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_formation;
    @NonNull
    private String nom_formation;
    @NonNull
    private String lieuformation;
    @NonNull
    private String Diplomes;
    @NonNull
    private LocalDate dategrad;
    @NonNull
    private String Desciption;


    public Formation() {

    }

    public long getId_formation() {
        return id_formation;
    }

    public void setId_formation(long id_formation) {
        this.id_formation = id_formation;
    }

    public String getLieuformation() {
        return lieuformation;
    }

    public void setLieuformation(String lieuformation) {
        this.lieuformation = lieuformation;
    }

    public String getDiplomes() {
        return Diplomes;
    }

    public void setDiplomes(String diplomes) {
        Diplomes = diplomes;
    }

    public LocalDate getDategrad() {
        return dategrad;
    }

    public void setDategrad(LocalDate dategrad) {
        this.dategrad = dategrad;
    }

    public String getDesciption() {
        return Desciption;
    }

    public void setDesciption(String desciption) {
        Desciption = desciption;
    }

    public String getNom_formation() {
        return nom_formation;
    }

    public void setNom_formation(String nom_formation) {
        this.nom_formation = nom_formation;
    }

    /*public CV getCurricilumVitae() {
        return CurricilumVitae;
    }

    public void setCurricilumVitae(CV curricilumVitae) {
        CurricilumVitae = curricilumVitae;
    }

    public Candidat getCandid() {
        return Candid;
    }

    public void setCandid(Candidat candid) {
        Candid = candid;
    }*/

    //many formations in one cv
/* @ManyToOne
    private CV CurricilumVitae;

    @ManyToOne
    private Candidat Candid ;   */



}
