package com.greenify.ecohub.controller;


import com.greenify.ecohub.database.dao.SpeakerDAO;
import com.greenify.ecohub.database.dao.UserDAO;
import com.greenify.ecohub.database.entity.Resource;
import com.greenify.ecohub.database.entity.Speaker;
import com.greenify.ecohub.database.entity.User;
import com.greenify.ecohub.security.AuthenticatedUserUtilities;
import jakarta.persistence.criteria.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/speakers")
public class SpeakerController {
    @Autowired
    private SpeakerDAO speakerDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private AuthenticatedUserUtilities authenticatedUserUtilities;

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


//        if ( speaker!= null){ //basically checks if the order is not empty it then generates the details for that order....
//            List<Map<String, Object>> orderDetails = orderDAO.getOrderDetails(order.getId());
//            response.addObject("orderDetails", orderDetails);
//
//            Double orderTotal = orderDAO.getOrderTotal(order.getId());
//            response.addObject("orderTotal", orderTotal);
//
//        } else {
//            response.addObject("error", "Speaker is not found");
//            return new ModelAndView("redirect:/error/404");
//        }


        return response;
    }
}