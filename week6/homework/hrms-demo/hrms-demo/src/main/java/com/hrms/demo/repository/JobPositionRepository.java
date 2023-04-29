package com.hrms.demo.repository;

import com.hrms.demo.entity.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionRepository extends JpaRepository<JobPosition,Long> {
}
