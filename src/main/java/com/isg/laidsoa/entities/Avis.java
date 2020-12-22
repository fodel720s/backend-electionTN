package com.isg.laidsoa.entities;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor

@Entity
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_avis;

    @NonNull
    private String type_Avis;

    public Avis() {

    }

    public long getId_avis() {
        return id_avis;
    }

    public void setId_avis(long id_avis) {
        this.id_avis = id_avis;
    }

    public String getType_Avis() {
        return type_Avis;
    }

    public void setType_Avis(String type_Avis) {
        this.type_Avis = type_Avis;
    }

    public Candidat getCandidat_avis() {
        return candidat_avis;
    }

    public void setCandidat_avis(Candidat candidat_avis) {
        this.candidat_avis = candidat_avis;
    }

    public Electeur getElecteur_avis() {
        return electeur_avis;
    }

    public void setElecteur_avis(Electeur electeur_avis) {
        this.electeur_avis = electeur_avis;
    }

    @ManyToOne

    private Candidat candidat_avis ;


    @ManyToOne

    private Electeur electeur_avis ;





/* @ManyToMany
    @JoinTable(name="CandidatReclamation",
            joinColumns = @JoinColumn(name="Id_Reclamation",referencedColumnName = "idrec"),
            inverseJoinColumns = @JoinColumn(name = "Id_Candidat",referencedColumnName = "idc")
    )
    private Set<Candidat> Rec_Candidats=new HashSet<>();*/


   /* @ManyToMany
    @JoinTable(name="ElecteurReclamation",
            joinColumns = @JoinColumn(name="Id_Reclamation",referencedColumnName = "idrec"),
            inverseJoinColumns = @JoinColumn(name = "Id_Electeur",referencedColumnName = "ide")*/

   // private Set<Electeur> Rec_Electeur=new HashSet<>();


}
