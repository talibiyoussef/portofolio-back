package com.youssef.backend.freework.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class JobPostings {
    @JsonProperty("@context")
    private String context;
    @JsonProperty("@id")
    private String id;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("hydra:totalItems")
    private int totalItems;
    @JsonProperty("hydra:member")
    private List<Member> member;
}





