package com.example.springboot.controller;


import com.example.springboot.database.dao.SpeakerDAO;
import com.example.springboot.database.entity.Speaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

        @GetMapping("/speaker")
        public ModelAndView speaker() {
            ModelAndView response = new ModelAndView("speakers/speaker");
            return response;
        }

    @GetMapping("/speakerDetails")
    public ModelAndView speakerDetails(@RequestParam(required = false)Integer id) {
        ModelAndView response = new ModelAndView("speakers/speakerDetails");
        List<Speaker> speaker = speakerDAO.findById(Integer.valueOf(id));
        response.addObject("speaker", speaker);
        return response;
    }
    }
