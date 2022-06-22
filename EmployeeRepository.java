package com.kuldeep.spring.demo.repository;

import com.kuldeep.spring.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee ,Integer> {
     Employee findByName(String name);
}
