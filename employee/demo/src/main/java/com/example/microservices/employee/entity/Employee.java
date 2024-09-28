package com.example.microservices.employee.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class Employee {
    private Integer id;
    private String department;
    private String position;
    private Date dataStart;
    private Double salary;
    private String companyName;

    public Employee(){}
    public Employee(Integer id, String department, String position, Date dataStart, Double salary, String companyName) {
        this.id = id;
        this.department = department;
        this.position = position;
        this.dataStart = dataStart;
        this.salary = salary;
        this.companyName = companyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDataStart() {
        return dataStart;
    }

    public void setDataStart(Date dataStart) {
        this.dataStart = dataStart;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(department, employee.department) && Objects.equals(position, employee.position) && Objects.equals(dataStart, employee.dataStart) && Objects.equals(salary, employee.salary) && Objects.equals(companyName, employee.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department, position, dataStart, salary, companyName);
    }
}
