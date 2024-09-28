package com.example.microservices.employee.repository;

import com.example.microservices.employee.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Component
public class EmployeRepository {
    private static final List<Employee> employes = new LinkedList<>();

    public static List<Employee> getEmployes() {
        employes.add(new Employee(1, "Dev", "software developer", new Date(), 35000.0, "FPT"));
        employes.add(new Employee(2, "BA", "business analyst", new Date(), 23000.0, "VNPT"));
        employes.add(new Employee(3, "PM", "Project manager", new Date(), 33000.0, "VNG"));
        employes.add(new Employee(4, "CIO", "Chief Information of Officer", new Date(), 1500000.0, "Viettel"));
        employes.add(new Employee(5, "QA", "Quality Assurance", new Date(), 180000.0, "LG"));
        return employes;
    }
}
