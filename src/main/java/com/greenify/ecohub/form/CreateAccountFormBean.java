package com.greenify.ecohub.form;

import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class CreateAccountFormBean {

    @NotEmpty
    private String communityName;

    @NotEmpty(message = "Email is required")
    @Length(max = 100, message = "Email must not be over 100 characters")
    @Email(message = "This must be a valid email")
    private String email;

    @NotEmpty
    private String password;

}