package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource

public interface CandidatRepository extends JpaRepository<Candidat,Long> {

    @Query("From Candidat where nom=?1 and prenom=?2")
    Optional<Candidat> findByNomEtPrenomEtMdp(String nom, String prenom);




}

