package com.greenify.ecohub.database.dao;


import com.greenify.ecohub.database.entity.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpeakerDAO  extends JpaRepository<Speaker, Long> {
    Speaker findById(Integer id);

    @Query(value="SELECT s from Speaker s where s.last_name =:lastName", nativeQuery = true)
    List<Speaker> findByLastName(String lastName);

    @Query("select s from Speaker s")
    List<Speaker> findAll();
}