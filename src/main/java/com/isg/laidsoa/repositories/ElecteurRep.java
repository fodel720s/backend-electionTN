package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.Electeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ElecteurRep extends JpaRepository<Electeur,Long> {
}
