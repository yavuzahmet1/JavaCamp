package com.hrms.demo.service.concretes;

import com.hrms.demo.entity.JobPosition;
import com.hrms.demo.repository.JobPositionRepository;
import com.hrms.demo.service.abstracts.JobPositionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionRepository jobPositionRepository;

    public JobPositionManager(JobPositionRepository jobPositionRepository) {
        this.jobPositionRepository = jobPositionRepository;
    }

    @Override
    public List<JobPosition> getAllJob() {
        return jobPositionRepository.findAll();
    }
}
