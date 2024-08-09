package com.greenify.ecohub.service;

import com.greenify.ecohub.database.dao.UserDAO;
import com.greenify.ecohub.database.dao.UserRoleDAO;
import com.greenify.ecohub.database.entity.User;
import com.greenify.ecohub.database.entity.UserRole;
import com.greenify.ecohub.form.CreateAccountFormBean;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.password.*;
import org.springframework.stereotype.*;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserRoleDAO userRoleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public User createUser(CreateAccountFormBean form) {
        // there were no errors, so we can create the new user in the database
        User user = new User();

        user.setCommunityName(form.getCommunityName());
        // encrypt the password before saving it to the database
        user.setEmail(form.getEmail());

        // we are getting in a plain text password because the user entered it into the form
        String encryptedPassword = passwordEncoder.encode(form.getPassword());
        user.setPassword(encryptedPassword);


        // save the user to the database
        userDAO.save(user);

        // create a user role for the user
        UserRole userRole = new UserRole();
        userRole.setRoleName("USER");
        userRole.setUserId(user.getId());

        userRoleDao.save(userRole);

        return user;
    }

}
