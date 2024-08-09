package com.example.springboot.controller;

import com.example.springboot.database.dao.SpeakerDAO;
import com.example.springboot.database.entity.Speaker;
import com.example.springboot.database.entity.User;
import com.example.springboot.form.CreateSpeakerFormBean;
import com.example.springboot.security.AuthenticatedUserUtilities;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
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
    public ModelAndView speakerSubmit(CreateSpeakerFormBean form) {
        ModelAndView response = new ModelAndView("admin/createSpeaker");
        response.addObject("form", form);
        String url = dir + "speakers/" + form.getSpeakerImg();

        Speaker speaker = speakerDAO.findById(form.getId());
        if (speaker == null) {
            speaker = new Speaker();
        }
        speaker.setFirstName(form.getFirstName());
        speaker.setLastName(form.getLastName());
        speaker.setOrganization(form.getOrganization());
        speaker.setTitle(form.getTitle());
        speaker.setAbout(form.getAbout());
        speaker.setSpeakerImg(url);


        speaker = speakerDAO.save(speaker);

        return response;
    }
}
