package com.youssef.backend.freework.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Member {
    @JsonProperty("@id")
    private String id;
    @JsonProperty("@type")
    private String type;
    private String title;
    private String slug;
    private String description;
    private String candidateProfile;
    private String companyDescription;
    private String experienceLevel;
    private Integer minAnnualSalary;
    private Integer maxAnnualSalary;
    private int minDailySalary;
    private int maxDailySalary;
    private String currency;
    private int duration;
    private int durationValue;
    private String durationPeriod;
    private boolean renewable;
    private String remoteMode;
    private String applicationType;
    private String applicationContact;
    private String applicationUrl;
    private String applicationEmail;
    private int applicationsCount;
    private Location location;
    private String startsAt;
    private String reference;
    private Company company;
    private Job job;
    private List<Skill> skills;
    private String createdAt;
    private String updatedAt;
    private String publishedAt;
    private String status;
    private List<String> softSkills;
    private String expiredAt;
    private String source;
    private String origin;
    private List<String> contracts;
    private String annualSalary;
    private String dailySalary;
    private boolean published;
}