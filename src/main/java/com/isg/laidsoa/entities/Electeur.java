package com.isg.laidsoa.entities;

import lombok.NonNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Electeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ide;
  @NonNull
  private String nom_e;

  /* @ManyToOne
    private Candidat candidat_choisit;   */

    public Long getIde() {
        return ide;
    }

    public void setIde(Long ide) {
        this.ide = ide;
    }

    public String getNom_e() {
        return nom_e;
    }

    public void setNom_e(String nom_e) {
        this.nom_e = nom_e;
    }

   /* public Candidat getCandidat_choisit() {
        return candidat_choisit;
    }

    public void setCandidat_choisit(Candidat candidat_choisit) {
        this.candidat_choisit = candidat_choisit;
    }   */
}
