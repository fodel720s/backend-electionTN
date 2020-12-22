package com.isg.laidsoa.services;

import com.isg.laidsoa.entities.List_electoral;
import com.isg.laidsoa.repositories.List_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.Optional;

@Service
public class List_Service {

    @Autowired
    private List_Repository Lis_Electoral_Repo;
    public List_Service(List_Repository Lis_Electoral_Repo) {
        Lis_Electoral_Repo = Lis_Electoral_Repo;
    }



    public ResponseEntity<List_electoral> addListeCandidats(List_electoral l1)
    {
        Optional<List_electoral> listeCandidats = Lis_Electoral_Repo.findByNameAndDate(l1.getNom_list(), l1.getDate_list());
        if(listeCandidats.isPresent())
            new ResponseEntity(HttpStatus.BAD_REQUEST);
        List_electoral listeCandidats1=Lis_Electoral_Repo.save(l1);
        return new ResponseEntity(listeCandidats1,HttpStatus.CREATED);
    }



    public ResponseEntity<Collection<List_electoral>> getAllListeCandidats()
    {
        Collection<List_electoral> lst1=Lis_Electoral_Repo.findAll();
        if(lst1.isEmpty())
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        return new ResponseEntity(lst1,HttpStatus.OK);
    }

    public ResponseEntity<?> getListeById(Long id)
    {
        Optional<List_electoral> listeCandidats=Lis_Electoral_Repo.findById(id);

        return listeCandidats.map(x->ResponseEntity.ok().body(x))
                .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }


    public ResponseEntity deleteListe(Long id)
    {
        Optional<List_electoral> listeCandidats=Lis_Electoral_Repo.findById(id);
        if(listeCandidats.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Lis_Electoral_Repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }




  /*  public ResponseEntity<List_electoral> updateListe(Long id,List_electoral newListe)
    {
        Optional<List_electoral> listeCandidats=Lis_Electoral_Repo.findById(id);
        if(listeCandidats.isEmpty())
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        List_electoral l1=listeCandidats.get();
        l1.setNom_list (newListe.getNom_list());
        l1.setDate_list(newListe.getDate_list());

        l1.getCandidats().clear();
        for(var x:newListe.getCandidats())
        {
            l1.getCandidats().add(x);
        }
        List_electoral l=Lis_Electoral_Repo.save(l1);
        return new ResponseEntity(l,HttpStatus.OK);
    }
*/

}
