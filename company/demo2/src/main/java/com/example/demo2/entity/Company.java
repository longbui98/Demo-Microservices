package com.example.demo2.entity;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

@Component
public class Company {
    private String name;
    private String domain;
    private Date yearEstablish;
    private String location;

    public Company() {}

    public Company(String name, String domain, Date yearEstablish, String location) {
        this.name = name;
        this.domain = domain;
        this.yearEstablish = yearEstablish;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Date getYearEstablish() {
        return yearEstablish;
    }

    public void setYearEstablish(Date yearEstablish) {
        this.yearEstablish = yearEstablish;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(domain, company.domain) && Objects.equals(yearEstablish, company.yearEstablish) && Objects.equals(location, company.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, domain, yearEstablish, location);
    }
}
