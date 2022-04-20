package ru.feduncov.caseservice.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Case implements Serializable {

    private String activity;

    private String type;

    private Integer participants;

    private Double price;

    private String link;

    private Long key;

    private Double accessibility;
}
