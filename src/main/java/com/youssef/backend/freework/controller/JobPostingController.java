package com.youssef.backend.freework.controller;


import com.youssef.backend.freework.model.JobPostings;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JobPostingController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("getJobs/{page}/{itemsPerPage}/{contracts}/{locationKeys}/{minDailySalary}")
    public JobPostings getJobPostings(@RequestParam Integer page, @RequestParam Integer itemsPerPage, @RequestParam String contracts, @RequestParam String locationKeys, @RequestParam Integer minDailySalary  ) {
        String url = "https://www.free-work.com/api/job_postings?page=".concat(String.valueOf(page)).concat("&itemsPerPage=").concat(String.valueOf(itemsPerPage)).concat("&contracts=").concat(contracts).concat("&locationKeys=").concat(locationKeys).concat("&minDailySalary").concat(String.valueOf(minDailySalary));

        HttpHeaders headers = new HttpHeaders();
        headers.set("accept-language", "fr");

        HttpEntity request = new HttpEntity(headers);

        ResponseEntity<JobPostings> response = this.restTemplate.exchange(url, HttpMethod.GET, request, JobPostings.class, 1);
        if(response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();

        } else {
            return null;
        }
    }

}
