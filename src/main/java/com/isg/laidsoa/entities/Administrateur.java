package com.isg.laidsoa.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Entity
public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ida;

    private String password;

    /*@OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
    private Set<Candidat> ListCand=new HashSet<>();*/

    public Administrateur(String password) {

        this.password=password;

    }

    public Administrateur() {

    }
}
