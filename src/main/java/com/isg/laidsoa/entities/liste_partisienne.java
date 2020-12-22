package com.isg.laidsoa.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor


@Entity
public class liste_partisienne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_partis;
    @NonNull
    private String Nomlistepartis;

   /* @OneToMany(mappedBy = "candidat",cascade = CascadeType.ALL)
    Set<Candidat> ListCandidat=new HashSet<>();

    @OneToOne
    private partie partie;  */

    public liste_partisienne() {

    }
}
