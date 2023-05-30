package com.example.wslab4.repository;

import com.example.wslab4.entity.Job;
import com.example.wslab4.entity.Projections.JobWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "job",excerptProjection = JobWithId.class)
public interface JobRepository extends JpaRepository<Job, String> {
}
