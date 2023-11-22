package com.youssef.backend.freework.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Data
@Component
@JsonIgnoreProperties(ignoreUnknown = true)

public class JobPostings{
    @JsonProperty("hydra:totalItems")
    private int totalItems;
    @JsonProperty("hydra:member")
    private List<Member> member;
}





