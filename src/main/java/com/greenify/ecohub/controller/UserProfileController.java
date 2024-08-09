package com.greenify.ecohub.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserProfileController {
    @GetMapping("/profile")
    public ModelAndView getUserProfile(){
        ModelAndView response = new ModelAndView("userProfile");
        return response;
    }
}
