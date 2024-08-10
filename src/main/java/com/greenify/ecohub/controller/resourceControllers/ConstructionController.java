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
public class ConstructionController {
    @Autowired
    private ResourceDAO resourceDAO;

    @GetMapping("/construction")
    public ModelAndView constructionResources() {
        ModelAndView response = new ModelAndView("resources/construction");
        List<Resource> resources = resourceDAO.findTypeResources("construction");
        response.addObject("resources", resources);
        return response;
    }
}