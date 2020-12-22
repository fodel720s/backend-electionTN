package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Optional;

@RepositoryRestResource

public interface FormationRep extends JpaRepository<Formation,Long> {

    @Query("From Formation where nom_formation=?1")
    Optional<Formation> findByName(String nom_Formation);


}
