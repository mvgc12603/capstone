package com.example.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class IndexController {

//    @GetMapping("/signup-login")
//    public ModelAndView index() {
//        ModelAndView response = new ModelAndView("signup-login");
//        return response;
//    }

    @GetMapping("/contact")
    public ModelAndView contact() {
        ModelAndView response = new ModelAndView("contact");
        return response;
    }
}

//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@Slf4j
//@Controller
//public class IndexController {
//
//        @Autowired
//        private ResourceDAO resourceDAO;
//
//        @GetMapping("/resource")
//        public ModelAndView index(@RequestParam(required = false) Integer id) { // http://localhost:8080/?id=2
//            ModelAndView response = new ModelAndView("resource");
//            ResourceDAO resource = (ResourceDAO) resourceDAO.findById(id);
//            response.addObject("resource", resource);
//
//            return response;
//        }
//
//        @GetMapping("/index/{id}")
//    public ModelAndView indexPathVar(@PathVariable Integer id) { // http://localhost:8080/index/1
//        public ModelAndView indexPathVar(@PathVariable(name = "id") Integer productId) { // http://localhost:8080/index/1
//            ModelAndView response = new ModelAndView("index");
//            Product product = productDAO.findById(productId);
//            response.addObject("message", "Hello World!");
//            response.addObject("product", product);
//
//            log.debug("Debug level");
//            log.info("Info level");
//            log.warn("Warn level");
//            log.error("Error level");
//            return response;
//        }

//}
