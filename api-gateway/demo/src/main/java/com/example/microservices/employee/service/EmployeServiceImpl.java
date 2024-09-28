package com.example.microservices.employee.service;

import com.example.microservices.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.microservices.employee.repository.EmployeRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class EmployeServiceImpl implements IEmployeService {
    private static List<Employee> employees = new LinkedList<>();

    @Autowired
    public EmployeServiceImpl() {
        employees = EmployeRepository.getEmployes();
    }

    @Override
    public List<Employee> getAllEmployess() {
        return employees;
    }

    @Override
    public Employee getById(Integer id) {
        if (employees.isEmpty()) {
            return new Employee();
        }
        Optional<Employee> existingEmployee = employees.stream().filter(emp -> id.equals(emp.getId())).findFirst();
        if (!existingEmployee.isPresent()) {
            System.out.println("============ EMPLOYEE NOT FOUND ============");
        }
        return existingEmployee.get();
    }

    @Override
    public void updateEmployee(Employee employee) {
        if(employees.isEmpty()){
            return;
        }
        Employee existingEmployee = employees.stream().filter(emp -> emp.getId().equals(employee.getId())).findFirst().get();
        if (!Objects.isNull(existingEmployee)) {
            existingEmployee.setPosition(employee.getPosition());
            existingEmployee.setDepartment(employee.getDepartment());
            existingEmployee.setSalary(employee.getSalary());
            existingEmployee.setDataStart(employee.getDataStart());
        }else{
            System.out.println("====== Employee Not Found =======");
        }
    }
}
