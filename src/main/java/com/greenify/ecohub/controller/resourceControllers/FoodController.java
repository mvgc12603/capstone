package com.greenify.ecohub.controller.resourceControllers;

import com.greenify.ecohub.database.dao.ResourceDAO;
import com.greenify.ecohub.database.entity.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/resources")
public class FoodController {
    @Autowired
    private ResourceDAO resourceDAO;

    @GetMapping("/food")
    public ModelAndView foodResources() {
        ModelAndView response = new ModelAndView("resources/food");
        List<Resource> resources = resourceDAO.findTypeResources("food");
        //1st para is modelAndView
        // 2nd resource param linked to List<Resource> resource
//        so adding value of resource list to the modelAndView attribute
        response.addObject("resources", resources);
        return response;
    }
}
