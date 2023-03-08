package com.aboutme.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CBTForm {

    @Id
    private String id;
    private LocalDateTime date;
    private String situation;
    private List<String> unhelpfulThoughts = new ArrayList<>();
    private List<String> feelings = new ArrayList<>();
    private String behaviour;
    private List<String> factsSupportUnhelpfulThoughts = new ArrayList<>();
    private List<String> factsProvideEvidenceAgainstUnhelpfulThoughts = new ArrayList<>();
    private List<String> realisticPerspective = new ArrayList<>();
    private String outcome;
}
