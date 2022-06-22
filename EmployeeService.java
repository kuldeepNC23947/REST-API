package com.kuldeep.spring.demo.service;

import com.kuldeep.spring.demo.entity.Employee;
import com.kuldeep.spring.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService{
    @Autowired
    private EmployeeRepository repo;

    public Employee saveEmployee(Employee employee)
    {
       return repo.save(employee);
    }
    public List<Employee> saveEmployees(List<Employee> employees)
    {
        return repo.saveAll(employees);
    }
    public Employee getEmployeeById(int id)
    {
        return repo.findById(id).orElse(null);
    }
    public Employee getEmployeeByName(String name)
    {
        return repo.findByName(name);
    }

    public String deleteEmployee(int id)
    {
         repo.deleteById(id);
         return "product removed"+id;
    }
    public Employee updateEmployee(Employee employee)
    {
        Employee existingEmployee= repo.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setAddress(employee.getAddress());
        return repo.save(existingEmployee);
    }



}
