package ru.feduncov.caseservice.controller.dto;

import lombok.Data;
import ru.feduncov.caseservice.entity.Case;

import java.io.Serializable;

@Data
public class CaseResponseDTO implements Serializable {

    private String activity;

    public CaseResponseDTO(Case c) {
        this.activity = c.getActivity();
    }
}
