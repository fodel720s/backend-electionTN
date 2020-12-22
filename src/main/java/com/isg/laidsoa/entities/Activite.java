package com.isg.laidsoa.entities;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor

@Entity
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Act;
    private String support;
    private String Details;
    private String type;
    private Duration duree;

    public Activite(String support, String details, String type, Duration duree) {
        this.support = support;
        Details = details;
        this.type = type;
        this.duree = duree;
    }

    public int getId_Act() {
        return id_Act;
    }

    public void setId_Act(int id_Act) {
        this.id_Act = id_Act;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }
}