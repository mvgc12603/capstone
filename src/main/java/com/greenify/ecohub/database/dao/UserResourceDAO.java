package com.greenify.ecohub.database.dao;

import com.greenify.ecohub.database.entity.UserResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserResourceDAO extends JpaRepository<UserResource, Long> {

    List<UserResource> findByUserId(Integer userId);
}
