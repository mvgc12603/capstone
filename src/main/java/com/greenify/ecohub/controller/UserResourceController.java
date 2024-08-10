package com.greenify.ecohub.controller;

import com.greenify.ecohub.database.dao.ResourceDAO;
import com.greenify.ecohub.database.dao.UserDAO;
import com.greenify.ecohub.database.dao.UserResourceDAO;
import com.greenify.ecohub.database.entity.Resource;
import com.greenify.ecohub.database.entity.User;
import com.greenify.ecohub.database.entity.UserResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


@Slf4j
@Controller
public class UserResourceController {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ResourceDAO resourceDAO;

    @Autowired
    private UserResourceDAO userResourceDAO;

    @GetMapping("/user/{userId}/resource/{resourceId}/add") //{} creates a pathvariable, any value can be passed in
    public ModelAndView addUserResource(@PathVariable Integer userId, @PathVariable Integer resourceId){
        ModelAndView response = new ModelAndView();
        User user = userDAO.findById(userId);
        Resource resource = resourceDAO.findById(resourceId);
        UserResource userResource = new UserResource();
        userResource.setUser(user);
        //        userResource.setUserId(userId); would not work because of "insertable = false, updatable = false" in entity
        userResource.setResource(resource);

        userResourceDAO.save(userResource); //creates a userResource, with an AI id
        response.setViewName("redirect:/user/profile");
        return response;
    }
}
