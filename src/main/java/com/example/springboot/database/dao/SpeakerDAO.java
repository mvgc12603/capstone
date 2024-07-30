package com.example.springboot.database.dao;


import com.example.springboot.database.entity.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpeakerDAO  extends JpaRepository<Speaker, Long> {
    @Query("select s from Speaker s where s.id =:id")
    Speaker findById(Integer id);
}
