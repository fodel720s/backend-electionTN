package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AdministrateurRep extends JpaRepository<Administrateur,Integer> {
}
