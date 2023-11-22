package com.youssef.backend.freework.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Location {
    @JsonProperty("@type")
    private String type;
    @JsonProperty("@id")
    private String id;
    private String street;
    private String locality;
    private String postalCode;
    private String adminLevel1;
    private String adminLevel2;
    private String country;
    private String countryCode;
    private String latitude;
    private String longitude;
    private String key;
    private String label;
    private String shortLabel;
}
