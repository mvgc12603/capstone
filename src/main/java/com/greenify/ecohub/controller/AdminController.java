package com.greenify.ecohub.controller;

import com.greenify.ecohub.database.dao.SpeakerDAO;
import com.greenify.ecohub.database.entity.Speaker;
import com.greenify.ecohub.database.entity.User;
import com.greenify.ecohub.form.CreateAccountFormBean;
import com.greenify.ecohub.form.CreateSpeakerFormBean;
import com.greenify.ecohub.security.AuthenticatedUserUtilities;
import com.greenify.ecohub.service.SpeakerService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/admin")
@PreAuthorize("hasAuthority('ADMIN')") //user role,
public class AdminController {

    @Autowired
    private AuthenticatedUserUtilities authenticatedUserUtilities;

    @Autowired
    private SpeakerDAO speakerDAO;

    @Autowired
    private SpeakerService speakerService;

    private String dir = "../pub/assets/img/";

    @GetMapping("/dashboard")
    public ModelAndView dashboard() throws Exception {
        ModelAndView response = new ModelAndView("admin/dashboard");

        User user = authenticatedUserUtilities.getCurrentUser();
        log.debug(user.toString());

        return response;
    }

    //    Speakers - admin control
    @GetMapping("/createSpeaker")
    public ModelAndView createSpeaker() {
        ModelAndView response = new ModelAndView("admin/createSpeaker");
        response.addObject("imgURL", dir + "speakers/"); //idk??
        return response;
    }

    @PostMapping("/createSpeaker")
    public ModelAndView speakerSubmit(@Valid CreateSpeakerFormBean form, BindingResult bindingResult) {
        ModelAndView response = new ModelAndView("admin/createSpeaker");

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }
            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);
            String url = dir + "speakers/" + form.getSpeakerImg();
        } else {
            // there were no errors, so we can create the new user in the database
            Speaker speaker = speakerDAO.findById(form.getId());
            if (speaker == null) {
                speaker = new Speaker();
            }
            speaker = speakerService.createSpeaker(form, speaker);
            response.setViewName("redirect:/speakers/speaker");
        }
        return response;
    }
    }

