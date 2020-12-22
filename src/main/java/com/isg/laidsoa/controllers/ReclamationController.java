package com.isg.laidsoa.controllers;

import com.isg.laidsoa.entities.Avis;
import com.isg.laidsoa.services.AvisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/Avis&Reclamations")
public class ReclamationController {

    @Autowired
    private AvisService avis_Service;
    private final Logger log = LoggerFactory.getLogger(Avis.class);



    @GetMapping("/all")
    public ResponseEntity<Collection<Avis>> getAllReclamations()
    {
        return avis_Service.getAllReclamations();
    }

    @GetMapping("/reclamation/{id}")
    public ResponseEntity<?> getReclamationById(@PathVariable Long id)
    {
        return avis_Service.getReclamationById(id);
    }



    @PostMapping("/newreclamation")
    public ResponseEntity<Avis> addnewReclamation(@Valid @RequestBody Avis A1)
    {
        return avis_Service.addAvis(A1);
    }


    @PutMapping("/reclamation/{id}")
    public ResponseEntity<Avis> modifyReclamation(@PathVariable Long id, @Valid @RequestBody Avis a1)
    {
        return avis_Service.updateReclamation(id,a1);
    }


    @DeleteMapping("/deletereclamation/{id}")
    public ResponseEntity<?> deleteReclamation(@PathVariable Long id) {

        return avis_Service.deleteReclamation(id);
    }




















}
