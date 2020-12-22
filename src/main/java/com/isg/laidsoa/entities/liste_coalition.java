package com.isg.laidsoa.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor

@Entity
public class liste_coalition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_coalition;
    @NonNull
    private String Nomlistcoalition;

   /* @OneToMany(mappedBy = "Candidat",cascade = CascadeType.ALL)
    Set<Candidat> ListCandidat=new HashSet<>();

    @OneToMany(mappedBy = "partie",cascade = CascadeType.ALL)
    Set<partie> Parties=new HashSet<>();
*/

    public liste_coalition() {

    }
}