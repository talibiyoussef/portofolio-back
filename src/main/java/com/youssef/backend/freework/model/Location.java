package com.youssef.backend.freework.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Component
@JsonIgnoreProperties(ignoreUnknown = true)

public class Location  {
    private String adminLevel1;
    private String adminLevel2;
    private String country;
    private String latitude;
    private String longitude;
    private String label;
    private String shortLabel;
}
