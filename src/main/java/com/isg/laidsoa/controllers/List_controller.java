package com.isg.laidsoa.controllers;

import com.isg.laidsoa.entities.List_electoral;
import com.isg.laidsoa.services.List_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/ListeElectoral")

public class List_controller {

    @Autowired
    private List_Service ListService;
    private final Logger log = LoggerFactory.getLogger(List_electoral.class);




    @GetMapping("/all")
    public ResponseEntity<Collection<List_electoral>> getAllListeCandidats()
    {
        return ListService.getAllListeCandidats();
    }

    @GetMapping("/liste/{id}")
    public ResponseEntity<?> getListeById(@PathVariable Long id)
    {
        return ListService.getListeById(id);
    }



    @PostMapping("/newliste")
    public ResponseEntity<List_electoral> addListeCandidats(@Valid @RequestBody List_electoral L1)
    {
        return ListService.addListeCandidats(L1);
    }


   // @PutMapping("/liste/{id}")
  /*  public ResponseEntity<List_electoral> modifylist(@PathVariable Long id, @Valid @RequestBody List_electoral l1)
    {
        return ListService.updateListe(id,l1);
    }*/


    @DeleteMapping("/deleteliste/{id}")
    public ResponseEntity<?> deletelist(@PathVariable Long id) {

        return ListService.deleteListe(id);
    }








}

