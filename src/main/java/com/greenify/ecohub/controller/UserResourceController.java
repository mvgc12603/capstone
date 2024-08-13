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

    //when add btn clicked, this controller handles it
    @GetMapping("/user/{userId}/resource/{resourceId}/add")
    public ModelAndView addUserResource(@PathVariable Integer userId, @PathVariable Integer resourceId) {
        ModelAndView response = new ModelAndView();
        User user = userDAO.findById(userId);
        Resource resource = resourceDAO.findById(resourceId);

        // Check if the UserResource already exists
        UserResource existingUserResource = userResourceDAO.findByUserIdAndResourceId(userId, resourceId);
        if (existingUserResource == null) {
            UserResource userResource = new UserResource();
            userResource.setUser(user);
            userResource.setResource(resource);

            userResourceDAO.save(userResource);
            response.setViewName("redirect:/user/profile");// Creates a new UserResource
        }
        String type = resource.getType();
        response.setViewName("redirect:/resources/" + type.toLowerCase());
        return response;
    }

    @GetMapping("/user/{id}/remove") //{} creates a path variable, any value can be passed in
    public ModelAndView removeUserResource(@PathVariable Integer id){
        ModelAndView response = new ModelAndView();
        UserResource userResource = userResourceDAO.findById(id);
        userResourceDAO.delete(userResource); //deletes a userResource by its id
        response.setViewName("redirect:/user/profile");
        return response;
    }
}
