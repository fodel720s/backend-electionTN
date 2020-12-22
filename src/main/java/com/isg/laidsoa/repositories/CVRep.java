package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.CV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CVRep extends JpaRepository<CV,Long> {
}
