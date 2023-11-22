package com.youssef.backend.freework.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Company {
    @JsonProperty("@id")
    private String id;
    @JsonProperty("@type")
    private String type;
    private String name;
    private String slug;
    private String description;
    private Location location;
    private String logo;
    private boolean directoryFreeWork;
    private String coverPicture;
}