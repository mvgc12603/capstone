package com.greenify.ecohub.service;

import com.greenify.ecohub.database.dao.SpeakerDAO;
import com.greenify.ecohub.database.entity.Speaker;
import com.greenify.ecohub.form.CreateSpeakerFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SpeakerService {

    @Autowired
    private SpeakerDAO speakerDAO;


    public Speaker createSpeaker(CreateSpeakerFormBean form, Speaker speaker) {
        // there were no errors, so we can create the new user in the database

        speaker.setFirstName(form.getFirstName());

        speaker.setLastName(form.getLastName());

        speaker.setOrganization(form.getOrganization());

        speaker.setTitle(form.getTitle());

        speaker.setAbout(form.getAbout());

        speaker.setSpeakerImg(form.getSpeakerImg());

        // save the speaker to the database
        speakerDAO.save(speaker);


        return speaker;
    }

}

