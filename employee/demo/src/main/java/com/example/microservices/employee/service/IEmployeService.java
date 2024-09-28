package com.example.microservices.employee.service;

import com.example.microservices.employee.entity.Employee;

import java.util.List;

public interface IEmployeService {
    List<Employee> getAllEmployess();

    Employee getById(Integer id);

    void updateEmployee(Employee employee);
}
