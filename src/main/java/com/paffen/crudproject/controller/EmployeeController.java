package com.paffen.crudproject.controller;

import com.paffen.crudproject.entity.Employee;
import com.paffen.crudproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
      return employeeService.saveEmployee(employee);
    }
}
