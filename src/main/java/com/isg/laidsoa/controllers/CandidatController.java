package com.isg.laidsoa.controllers;
import com.isg.laidsoa.services.CandidatService;
import com.isg.laidsoa.entities.Candidat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/Candidat")
public class CandidatController {

    @Autowired
    private CandidatService CanService;
    private final Logger log = LoggerFactory.getLogger(Candidat.class);

    @GetMapping("/all")
    public ResponseEntity<Collection<Candidat>> getAllCandidat()
    {
        return CanService.getAllCandidat();
    }



    @GetMapping("/Candidat/{id}")
    public ResponseEntity<?> getCandidatById(@PathVariable Long id)
    {
        return CanService.getCandidatById(id);
    }



    @PostMapping("/newCandidat")
    public ResponseEntity<Candidat> addnewCandidat(@Valid @RequestBody Candidat c1)
    {
        return CanService.addCandidat(c1);
    }



    @PutMapping("/Candidat/{id}")
   /* public ResponseEntity<Candidat> modifyCandidat(@PathVariable Long id, @Valid @RequestBody Candidat c1)
    {
        return CanService.updateCandidat(id,c1);
    }*/




    @DeleteMapping("/deleteCandidat/{id}")
    public ResponseEntity<?> deleteCandidat(@PathVariable Long id) {

        return CanService.deleteCandidat(id);
    }














}



