package com.hrms.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_titles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
}
