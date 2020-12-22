package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.Optional;

@RepositoryRestResource
public interface ReclamationRep  extends JpaRepository<Avis,Long> {

   @Query("From Avis where id_avis=?1 ")
    Optional<Avis> findByAvisId(long id_avis);






}
