package com.isg.laidsoa.repositories;


import com.isg.laidsoa.entities.Justificatif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JustificatifRepository extends JpaRepository<Justificatif,Integer> {
}
