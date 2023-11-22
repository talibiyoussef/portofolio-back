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

public class Member {
    @JsonProperty("@id")
    private String id;
    private String title;
    private String description;
    private String candidateProfile;
    private String companyDescription;
    private String experienceLevel;
    private Integer minAnnualSalary;
    private Integer maxAnnualSalary;
    private int minDailySalary;
    private int maxDailySalary;
    private int duration;
    private int durationValue;
    private String durationPeriod;
    private boolean renewable;
    private String remoteMode;
    private String applicationType;
    private int applicationsCount;
    private Location location;
    private Company company;
    private Job job;
    private List<Skill> skills;
    private String createdAt;
    private String updatedAt;
    private String publishedAt;
    private String status;
    private String expiredAt;
    private String annualSalary;
    private String dailySalary;
}