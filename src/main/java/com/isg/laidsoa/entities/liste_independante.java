package com.isg.laidsoa.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor



@Entity
public class liste_independante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_indep;
    @NonNull
    private String Nomlisteindep;
/*
    @OneToMany(mappedBy = "idc",cascade = CascadeType.ALL)
    Set<Candidat> ListCandidat=new HashSet<>();  */

    public liste_independante() {

    }
}
