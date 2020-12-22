package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.Optional;

@RepositoryRestResource
public interface ActiviteRep extends JpaRepository<Activite,Long> {
    @Query("From Activite where id_Act=?1 and support=?2")
    Optional<Activite> findByIdandSupport(int id_Act, String support);
}
