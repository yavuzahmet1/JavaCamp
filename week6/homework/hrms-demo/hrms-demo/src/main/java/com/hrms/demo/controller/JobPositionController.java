package com.hrms.demo.controller;

import com.hrms.demo.entity.JobPosition;
import com.hrms.demo.service.abstracts.JobPositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobPositionController {
    private JobPositionService jobPositionService;

    public JobPositionController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping
    public List<JobPosition> getAll(){
        return this.jobPositionService.getAllJob();
    }
}
