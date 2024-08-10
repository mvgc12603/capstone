package com.greenify.ecohub.controller;

import com.greenify.ecohub.database.dao.UserResourceDAO;
import com.greenify.ecohub.database.entity.User;
import com.greenify.ecohub.database.entity.UserResource;
import com.greenify.ecohub.security.AuthenticatedUserUtilities;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserProfileController {

    @Autowired
    private UserResourceDAO userResourceDAO;

    @Autowired
    private AuthenticatedUserUtilities authenticatedUserUtilities;

    @GetMapping("/profile")
    public ModelAndView getUserProfile(){
        ModelAndView response = new ModelAndView("userProfile");
        Integer userId = authenticatedUserUtilities.getCurrentUser().getId();
        List<UserResource> userResources = userResourceDAO.findByUserId(userId);

        response.addObject("userResources", userResources);

//        Alternative to:
//        User user = authenticatedUserUtilities.getCurrentUser();
//        List<UserResource> userResources = userResourceDAO.findByUserId(user.getId());
//
//        Or:
//        List<UserResource> userResources = userResourceDAO.findByUserId(authenticatedUserUtilities.getCurrentUser().getId());

        return response;
    }
}
