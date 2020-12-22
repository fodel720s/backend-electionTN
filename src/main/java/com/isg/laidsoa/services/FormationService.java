package com.isg.laidsoa.services;

import com.isg.laidsoa.entities.Formation;
import com.isg.laidsoa.repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.Optional;

@Service
public class FormationService {

    @Autowired
    private FormationRep FormationRepos;

    public FormationService(FormationRep FormationRepos) {
        this.FormationRepos = FormationRepos;
    }

    public ResponseEntity<Formation> addFormation(Formation f1)
    {
        Optional<Formation> formation = FormationRepos.findByName(f1.getNom_formation());
        if(formation.isPresent())
            new ResponseEntity(HttpStatus.BAD_REQUEST);
        Formation formation1=FormationRepos.save(f1);
        return new ResponseEntity(formation1,HttpStatus.CREATED);
    }

    public ResponseEntity<Collection<Formation>> getAllFormations()
    {
        Collection<Formation> lst1=FormationRepos.findAll();
        if(lst1.isEmpty())
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        return new ResponseEntity(lst1,HttpStatus.OK);
    }



    public ResponseEntity<?> getFormationById(Long id)
    {
        Optional<Formation> formation=FormationRepos.findById(id);

        return formation.map(x->ResponseEntity.ok().body(x))
                .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }


    public ResponseEntity deleteFormation(Long id)
    {
        Optional<Formation> formation=FormationRepos.findById(id);
        if(formation.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        FormationRepos.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    public ResponseEntity<Formation> updateFormation(Long id,Formation newFormation)
    {
        Optional<Formation> formation=FormationRepos.findById(id);
        if(formation.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Formation f1=formation.get();
        f1.setNom_formation(newFormation.getNom_formation());
        f1.setLieuformation(newFormation.getLieuformation());
        f1.setDategrad(newFormation.getDategrad());
        f1.setDesciption(newFormation.getDesciption());
     //   f1.setCandid (newFormation.getCandid());

        Formation f=FormationRepos.save(f1);
        return new ResponseEntity(f,HttpStatus.OK);
    }














}
