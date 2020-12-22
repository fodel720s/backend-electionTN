package com.isg.laidsoa.controllers;

import com.isg.laidsoa.entities.Activite;
import com.isg.laidsoa.services.ActiviteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/Activites")
public class ActiviteController {

    @Autowired
    private ActiviteService ActService;
    private final Logger log =LoggerFactory.getLogger(Activite.class);


    @GetMapping("/all")
    public ResponseEntity<Collection<Activite>>getAllActivities()
    {
        return ActService.getAllActivities();
    }



    @GetMapping("/activite/{id}")
    public ResponseEntity<?> getActiviteById(@PathVariable Long id)
    {
        return ActService.getActiviteById(id);
    }



    @PostMapping("/newactivite")
    public ResponseEntity<Activite> addnewActivite(@Valid @RequestBody Activite a1)
    {
        return ActService.addActivite(a1);
    }



    @PutMapping("/activite/{id}")
    public ResponseEntity<Activite> modifyActivte(@PathVariable Long id, @Valid @RequestBody Activite a1)
    {
        return ActService.updateActivite(id,a1);
    }




    @DeleteMapping("/deleteactivite/{id}")
    public ResponseEntity<?> deleteActivite(@PathVariable Long id) {

        return ActService.deleteActivite(id);
    }




}
