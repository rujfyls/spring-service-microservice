package ru.feduncov.userservice.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CaseDTO implements Serializable {

    private String activity;
}
