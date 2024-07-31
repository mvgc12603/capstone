package com.example.springboot.controller.resourceControllers;

import com.example.springboot.database.dao.ResourceDAO;
import com.example.springboot.database.entity.Resource;
import com.example.springboot.database.entity.Speaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
        @Controller
        @RequestMapping("/resource")
public class ResourceController {
    @Autowired
    private ResourceDAO resourceDAO;

    @GetMapping("/")
    public ModelAndView resource() {
        ModelAndView response = new ModelAndView("/resource");
        List<Resource> resource = resourceDAO.findAll();
        response.addObject("resource", resource);
        return response;
    }



////
////        @GetMapping("/index/{id}")
//////    public ModelAndView indexPathVar(@PathVariable Integer id) { // http://localhost:8080/index/1
////        public ModelAndView indexPathVar(@PathVariable(name = "id") Integer productId) { // http://localhost:8080/index/1
////            ModelAndView response = new ModelAndView("index");
////            Product product = productDAO.findById(productId);
////            response.addObject("message", "Hello World!");
////            response.addObject("product", product);
////
////            log.debug("Debug level");
////            log.info("Info level");
////            log.warn("Warn level");
////            log.error("Error level");
////            return response;
////        }
}
