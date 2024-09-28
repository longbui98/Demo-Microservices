package com.example.demo2.service;

import com.example.demo2.entity.Company;

import java.util.List;

public interface ICompanyService {
    List<Company> getAllCompanies();

    Company getByName(String name);

    void updateCompany(Company company);
}
