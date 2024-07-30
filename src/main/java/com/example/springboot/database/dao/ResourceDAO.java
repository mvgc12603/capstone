package com.example.springboot.database.dao;


import com.example.springboot.database.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResourceDAO extends JpaRepository<Resource, Long>{

    @Query("select r from Resource r where r.type = :resources")
    List<Resource> findTypeResources(String resources);
}
