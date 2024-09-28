package com.example.microservices.employee.controller;

import com.example.microservices.employee.entity.Employee;
import com.example.microservices.employee.service.EmployeServiceImpl;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeServiceImpl employeService;

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>(employeService.getAllEmployess(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {

        return new ResponseEntity<>(employeService.getById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<HttpStatus> updateEmployee(@RequestBody Employee employee) {
        employeService.updateEmployee(employee);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
