package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.partie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PartieRepository extends JpaRepository<partie,Integer> {
}
