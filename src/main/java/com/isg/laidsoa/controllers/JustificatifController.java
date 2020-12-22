package com.isg.laidsoa.controllers;

import com.isg.laidsoa.entities.Justificatif;
import com.isg.laidsoa.repositories.JustificatifRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/Justificatifs")
public class JustificatifController {

    @Autowired
    private JustificatifRepository justif_repository;
    private Logger log= LoggerFactory.getLogger(Justificatif.class);
    @GetMapping("/all")
    public ResponseEntity<Collection<Justificatif>> getallJustificatifs()
    {
        Collection<Justificatif> res=justif_repository.findAll();
        if (res.isEmpty())
        {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(res,HttpStatus.OK);

    }
    @GetMapping("/Support/{id}")
    public Optional<Justificatif> getJustificatifById(@PathVariable int id)
    {
        return justif_repository.findById(id);
    }


    @PostMapping("/newSupport")
    public Justificatif ajouterJustificatif(@RequestBody Justificatif J1) {return justif_repository.save(J1);}

}

