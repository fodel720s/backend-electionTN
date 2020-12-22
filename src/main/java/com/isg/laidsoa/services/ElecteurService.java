package com.isg.laidsoa.services;
import com.isg.laidsoa.entities.Electeur;
import com.isg.laidsoa.repositories.ElecteurRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.Optional;

@Service
public class ElecteurService {
    @Autowired
    private ElecteurRep Elec_Repository;

    public ElecteurService(ElecteurRep eleReops) {
        Elec_Repository = Elec_Repository;
    }

    public ResponseEntity<Electeur> addElecteur(Electeur e1) {
        Electeur electeur1 = Elec_Repository.save(e1);
        return new ResponseEntity(electeur1, HttpStatus.CREATED);
    }

    public ResponseEntity<Collection<Electeur>> getAllElecteur() {
        Collection<Electeur> lst1 = Elec_Repository.findAll();
        if (lst1.isEmpty())
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        return new ResponseEntity(lst1, HttpStatus.OK);
    }


    public ResponseEntity<?> getElecteurById(Long ide) {
        Optional<Electeur> electeur = Elec_Repository.findById(ide);

        return electeur.map(x -> ResponseEntity.ok().body(x))
                .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity deleteElecteur(Long ide) {
        Optional<Electeur> electeur = Elec_Repository.findById(ide);
        if (electeur.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Elec_Repository.deleteById(ide);
        return new ResponseEntity<>(HttpStatus.OK);


    }



    public ResponseEntity<Electeur> updateElecteur(Long ide, Electeur newElecteur)
    {
        Optional<Electeur> electeur=Elec_Repository.findById(ide);
        if(electeur.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Electeur e1=electeur.get();
        e1.setNom_e(newElecteur.getNom_e());
        e1.setIde(newElecteur.getIde());
        Electeur a=Elec_Repository.save(e1);
        return new ResponseEntity(a,HttpStatus.OK);
    }







}