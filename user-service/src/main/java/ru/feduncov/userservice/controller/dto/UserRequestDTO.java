package ru.feduncov.userservice.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class UserRequestDTO implements Serializable {

    @JsonProperty("name")
    private String name;

    @JsonProperty("e_mail")
    private String email;

    @JsonProperty("password")
    private String password;
}

