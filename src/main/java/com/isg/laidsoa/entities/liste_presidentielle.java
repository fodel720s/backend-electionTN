package com.isg.laidsoa.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor



@Entity
public class liste_presidentielle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_list_pres;
    @NonNull
    private String Nomlistepres;
   /* @OneToMany(mappedBy = "idc",cascade = CascadeType.ALL)
    Set<Candidat> ListCandidat=new HashSet<>();

    @OneToMany(mappedBy = "idformation",cascade = CascadeType.ALL)
    Set<Formation> FormationCandidat=new HashSet<>();  */


    public liste_presidentielle() {

    }
}
