package com.isg.laidsoa.services;

import com.isg.laidsoa.entities.Avis;
import com.isg.laidsoa.repositories.ReclamationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class AvisService {

    @Autowired
    private ReclamationRep Avis_Repository;

    public AvisService(ReclamationRep Avis_Repository) {
        Avis_Repository = Avis_Repository;
    }

    public ResponseEntity<Avis> addAvis(Avis a1)
    {
        Optional<Avis> avis = Avis_Repository.findByAvisId(a1.getId_avis());
        if(avis.isPresent())
            new ResponseEntity(HttpStatus.BAD_REQUEST);
        Avis reclamation1=Avis_Repository.save(a1);
        return new ResponseEntity(reclamation1,HttpStatus.CREATED);
    }



    public ResponseEntity<Collection<Avis>> getAllReclamations()
    {
        Collection<Avis> lst1=Avis_Repository.findAll();
        if(lst1.isEmpty())
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        return new ResponseEntity(lst1,HttpStatus.OK);
    }

    public ResponseEntity<?> getReclamationById(Long id)
    {
        Optional<Avis> reclamation=Avis_Repository.findById(id);

        return reclamation.map(x->ResponseEntity.ok().body(x))
                .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity deleteReclamation(Long id)
    {
        Optional<Avis> reclamation=Avis_Repository.findById(id);
        if(reclamation.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Avis_Repository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    public ResponseEntity<Avis> updateReclamation(Long id,Avis newReclamation)
    {
        Optional<Avis> reclamation=Avis_Repository.findById(id);
        if(reclamation.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Avis a2=reclamation.get();
        a2.setType_Avis(newReclamation.getType_Avis());
        a2.setCandidat_avis(newReclamation.getCandidat_avis());
        a2.setElecteur_avis(newReclamation.getElecteur_avis());


        Avis A=Avis_Repository.save(a2);
        return new ResponseEntity(A,HttpStatus.OK);
    }
















}

