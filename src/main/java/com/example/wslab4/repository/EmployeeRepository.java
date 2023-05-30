package com.example.wslab4.repository;

import com.example.wslab4.entity.Employee;
import com.example.wslab4.entity.Projections.EmployeeWithId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employee", excerptProjection = EmployeeWithId.class)
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}