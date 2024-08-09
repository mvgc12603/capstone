package com.greenify.ecohub.controller;


import com.greenify.ecohub.database.dao.SpeakerDAO;
import com.greenify.ecohub.database.entity.Speaker;
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

    @GetMapping("/")
    public ModelAndView speaker() {
        ModelAndView response = new ModelAndView("speakers/speaker");
        List<Speaker> speakers = speakerDAO.findAll();
        response.addObject("speakers", speakers);
        return response;
    }


    @GetMapping("/details")
    public ModelAndView detail(@RequestParam Integer id) {
        ModelAndView response = new ModelAndView("speakers/details");
        Speaker speaker = speakerDAO.findById(id);
        response.addObject("speaker", speaker);
        return response;
    }



//    @GetMapping("/{id}")
//    public ModelAndView eventDetails(@PathVariable Integer id){
//        ModelAndView response = new ModelAndView("events/event-details");
//
//        response.addObject("id", id);
//
//        Event event = eventDAO.findById(id);
//        response.addObject("event", event);
//        Map<String,Object> eventDetails = eventDAO.getEventDetails(id); Amber is awesome wtf is happening
//        log.debug(eventDetails.toString());
//        response.addObject("eventDetails", eventDetails);
//
//        EventSignUpFormBean form = new EventSignUpFormBean();
//        response.addObject("form", form);
//        log.debug(form.getFirstName());
//
//        return response;
//    }

}
