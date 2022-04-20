package ru.feduncov.userservice.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.feduncov.userservice.entity.User;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class UserResponseDTO implements Serializable {

    @JsonProperty("id")
    private Long userId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("e_mail")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("created_at")
    private LocalDateTime created;

    @JsonProperty("case_for_user")
    private String activity;

    public UserResponseDTO(User user) {
        this.userId = user.getUserId();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.created = user.getCreated();
        this.activity = user.getActivity();
    }
}
