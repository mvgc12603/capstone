package com.example.springboot.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateSpeakerFormBean {
    @NotEmpty
    private Integer id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    private String organization;

    @NotEmpty
    private String title;

    @NotEmpty
    private String about;

    @NotEmpty
    private String speakerImg;

}

