package com.greenify.ecohub.database.dao;

import com.greenify.ecohub.database.entity.User;
import org.springframework.data.jpa.repository.*;

public interface UserDAO extends JpaRepository<User, Long> {

    User findById(Integer id); //override, needs to be created manually or type would be Long
    User findByEmailIgnoreCase(String email);

}