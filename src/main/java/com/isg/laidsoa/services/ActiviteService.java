package com.isg.laidsoa.services;

import com.isg.laidsoa.entities.Activite;
import com.isg.laidsoa.repositories.ActiviteRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.Optional;

@Service
public class ActiviteService {
    @Autowired
    private ActiviteRep activite_rep;
    public ActiviteService(ActiviteRep activite_rep) {
        this.activite_rep = activite_rep;
    }

    public ResponseEntity<Activite> addActivite(Activite a1)
    {
        Optional<Activite> activite = activite_rep.findByIdandSupport(a1.getId_Act(),a1.getSupport());
        if(activite.isPresent())
            new ResponseEntity(HttpStatus.BAD_REQUEST);
        Activite activite1=activite_rep.save(a1);
        return new ResponseEntity(activite1,HttpStatus.CREATED);
    }

    public ResponseEntity<Collection<Activite>> getAllActivities()
    {
        Collection<Activite> lst1=activite_rep.findAll();
        if(lst1.isEmpty())
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        return new ResponseEntity(lst1,HttpStatus.OK);
    }

    public ResponseEntity<?> getActiviteById(Long id)
    {
        Optional<Activite> activite=activite_rep.findById(id);

        return activite.map(x->ResponseEntity.ok().body(x))
                .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }


    public ResponseEntity deleteActivite(Long id)
    {
        Optional<Activite> activite=activite_rep.findById(id);
        if(activite.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        activite_rep.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    public ResponseEntity<Activite> updateActivite(Long id,Activite newActivite)
    {
        Optional<Activite> activite=activite_rep.findById(id);
        if(activite.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Activite a1=activite.get();
        a1.setType(newActivite.getType());
        a1.setDuree(newActivite.getDuree());
        a1.setSupport(newActivite.getSupport());
        a1.setDetails(newActivite.getDetails());



        Activite a=activite_rep.save(a1);
        return new ResponseEntity(a,HttpStatus.OK);
    }



}


