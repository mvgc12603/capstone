package com.greenify.ecohub.controller.resourceControllers;

import com.greenify.ecohub.database.dao.ResourceDAO;
import com.greenify.ecohub.database.entity.Resource;
import com.greenify.ecohub.database.entity.User;
import com.greenify.ecohub.security.AuthenticatedUserUtilities;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/resources")
public class ResourceTypeController {
    @Autowired
    private ResourceDAO resourceDAO;

    @Autowired
    private AuthenticatedUserUtilities authenticatedUserUtilities;

    @GetMapping("/{type}")
    public ModelAndView resourcesByType(@PathVariable("type") String type) {
        ModelAndView response = new ModelAndView("resources/" + type);

        // Fetch resources by type
        List<Resource> resources = resourceDAO.findResourcesByType(type);
        response.addObject("resources", resources);

        // Check if the user is authenticated
        User user = authenticatedUserUtilities.getCurrentUser();
        if (user != null) {
            response.addObject("userId", user.getId());
        }

        return response;
    }
}
//    public ModelAndView energyResources() {
//        ModelAndView response = new ModelAndView("resources/energy");
//        List<Resource> resources = resourceDAO.findResourcesByType("energy");
//        response.addObject("resources", resources);
//        User user = authenticatedUserUtilities.getCurrentUser(); //gets logged in user
//        if (user != null) { //otherwise page throws error if not logged in
////        response.addObject("user",user); would pass all info from user object
//            response.addObject("userId", user.getId());
//        }
//
//        return response;
