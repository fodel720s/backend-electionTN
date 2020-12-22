package com.isg.laidsoa.repositories;

import com.isg.laidsoa.entities.List_electoral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.Date;
import java.util.Optional;


@RepositoryRestResource

public interface List_Repository extends JpaRepository<List_electoral,Long> {

    @Query("From List_electoral where nom_list=?1 and date_list=?2 ")
    Optional<List_electoral> findByNameAndDate(String nom_list, Date date_List);
}
