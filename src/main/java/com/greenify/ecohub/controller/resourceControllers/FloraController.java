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
public class FloraController {
    @Autowired
    private ResourceDAO resourceDAO;

    @GetMapping("/flora")
    public ModelAndView waterResources() {
        ModelAndView response = new ModelAndView("resources/flora");
        List<Resource> resources = resourceDAO.findTypeResources("flora");
        response.addObject("resources", resources);
        return response;
    }
}