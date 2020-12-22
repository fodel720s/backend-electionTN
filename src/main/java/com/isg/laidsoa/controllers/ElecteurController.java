package com.isg.laidsoa.controllers;

import com.isg.laidsoa.entities.Electeur;
import com.isg.laidsoa.services.ElecteurService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/Electeur")
public class ElecteurController {

    @Autowired
    private ElecteurService EleService;
    private final Logger log = LoggerFactory.getLogger(Electeur.class);

    @GetMapping("/all")
    public ResponseEntity<Collection<Electeur>> getAllElecteur()
    {
        return EleService.getAllElecteur();
    }



    @GetMapping("/Electeur/{id}")
    public ResponseEntity<?> getElecteurById(@PathVariable Long id)
    {
        return EleService.getElecteurById(id);
    }



    @PostMapping("/newElecteur")
    public ResponseEntity<Electeur> addnewElecteur(@Valid @RequestBody Electeur e1)
    {

        return EleService.addElecteur(e1);
    }



    @PutMapping("/Electeur/{id}")
    public ResponseEntity<Electeur> modifyElecteur(@PathVariable Long id, @Valid @RequestBody Electeur e1)
    {
        return EleService.updateElecteur(id,e1);
    }




    @DeleteMapping("/deleteElecteur/{id}")
    public ResponseEntity<?> deleteElecteur(@PathVariable Long id) {

        return EleService.deleteElecteur(id);
    }













}
