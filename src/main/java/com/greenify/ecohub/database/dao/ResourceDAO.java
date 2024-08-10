package com.greenify.ecohub.database.dao;


import com.greenify.ecohub.database.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResourceDAO extends JpaRepository<Resource, Long>{

    @Query("select r from Resource r where r.type = :resources")
    List<Resource> findResourcesByType(String resources);

    @Query("select distinct r.type from Resource r")
    List<String> findResourceTypes();

    Resource findById(Integer id);

}
