package com.example.wslab4.entity.Projections;

import com.example.wslab4.entity.Job;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "JobWithId", types = {Job.class})
public interface JobWithId {
    String getId();
    String getJobTitle();
    Integer getMinSalary();
    Integer getMaxSalary();
}
