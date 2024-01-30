package com.paffen.crudproject.service;

import com.paffen.crudproject.DAO.EmployeeDao;
import com.paffen.crudproject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    public Employee saveEmployee(Employee employee){
       return employeeDao.save(employee);
    }
}
