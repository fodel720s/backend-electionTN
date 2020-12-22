package com.isg.laidsoa.controllers;


import com.isg.laidsoa.entities.Formation;
import com.isg.laidsoa.services.FormationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/Experiences")
public class FormationController {
    @Autowired
    private FormationService FormService;
    private final Logger log = LoggerFactory.getLogger(Formation.class);


    @GetMapping("/all")
    public ResponseEntity<Collection<Formation>> getAllFormations()
    {
        return FormService.getAllFormations();
    }

    @GetMapping("/experience/{id}")
    public ResponseEntity<?> getFormationById(@PathVariable Long id)
    {
        return FormService.getFormationById(id);
    }



    @PostMapping("/newexperience")
    public ResponseEntity<Formation> addnewFormation(@Valid @RequestBody Formation F1)
    {
        return FormService.addFormation(F1);
    }


    @PutMapping("/experience/{id}")
    public ResponseEntity<Formation> UpdateFormation(@PathVariable Long id, @Valid @RequestBody Formation e1)
    {
        return FormService.updateFormation(id,e1);
    }


    @DeleteMapping("/deleteexperience/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable Long id) {

        return FormService.deleteFormation(id);
    }

}

