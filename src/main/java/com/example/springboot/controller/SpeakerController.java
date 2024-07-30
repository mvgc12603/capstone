package com.example.springboot.controller;


import com.example.springboot.database.dao.SpeakerDAO;
import com.example.springboot.database.entity.Speaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/speakers")
public class SpeakerController {
    @Autowired
    private SpeakerDAO speakerDAO;

    @GetMapping("/")
    public ModelAndView speaker() {
        ModelAndView response = new ModelAndView("speakers/speaker");
        return response;
    }

    @GetMapping("/details")
    public ModelAndView detail(@RequestParam Integer id) {
        ModelAndView response = new ModelAndView("speakers/details");
        Speaker speaker = speakerDAO.findById(id);
        response.addObject("speaker", speaker);
        return response;
    }

    @GetMapping("/details/{id}")
    public ModelAndView details(@PathVariable(name = "id") Integer id) {
        ModelAndView response = new ModelAndView("speakers/details");
        Speaker speaker = speakerDAO.findById(id);
        response.addObject("speaker", speaker);
        return response;
    }
}
