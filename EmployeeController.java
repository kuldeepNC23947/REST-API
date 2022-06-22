package com.kuldeep.spring.demo.controller;

import com.kuldeep.spring.demo.entity.Employee;
import com.kuldeep.spring.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee-record")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return service.saveEmployee(employee);
    }
    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees)
    {
        return service.saveEmployees(employees);
    }
    @GetMapping("/Employees/{id}")
    public Employee findEmployeeById(@PathVariable int id)
    {
        return service.getEmployeeById(id);
    }
    @GetMapping("/Employees/{name}")
    public Employee findEmployeeByName(@PathVariable String name)
    {
        return service.getEmployeeByName(name);
    }

    @PutMapping("update")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("delete/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        return service.deleteEmployee(id);
    }



}
