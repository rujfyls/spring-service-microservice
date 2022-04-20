package ru.feduncov.caseservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.feduncov.caseservice.client.BoredAPIClient;
import ru.feduncov.caseservice.controller.dto.CaseResponseDTO;
import ru.feduncov.caseservice.entity.Case;

@RestController
@RequestMapping("/case")
public class CaseController {

    private final BoredAPIClient boredAPIClient;

    public CaseController(BoredAPIClient boredAPIClient) {
        this.boredAPIClient = boredAPIClient;
    }

    @GetMapping("/random")
    public ResponseEntity<CaseResponseDTO> getRandomCase() {
        return ResponseEntity.ok(new CaseResponseDTO(boredAPIClient.getRandomCase()));
    }
}
