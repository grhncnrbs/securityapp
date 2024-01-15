package com.grhncnrbs.securityapp.repository;

import com.grhncnrbs.securityapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findByEmail(String email);
}
