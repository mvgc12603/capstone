package com.greenify.ecohub.form;

import org.springframework.validation.BindingResult;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;


@Getter
@Setter
public class CreateSpeakerFormBean {

    private Integer id;

    @NotEmpty(message = "First Name is required")
    @Pattern(regexp = "[a-zA-Z]+", message = "Firstname must have characters only.")
    @Length(max = 30, message = "Firstname must not be over 30 characters")
    private String firstName;

    @NotEmpty(message = "Last Name is required")
    @Pattern(regexp = "[a-zA-Z]+", message = "Lastname must have characters only.")
    @Length(max = 50, message = "Lastname must not be over 50 characters")
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

