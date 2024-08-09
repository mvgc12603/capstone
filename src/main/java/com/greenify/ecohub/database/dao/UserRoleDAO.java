package com.greenify.ecohub.database.dao;

import com.greenify.ecohub.database.entity.UserRole;
import org.springframework.data.jpa.repository.*;
import java.util.List;

public interface UserRoleDAO extends JpaRepository<UserRole, Long> {
    List<UserRole> findByUserId(Integer userId);
}

