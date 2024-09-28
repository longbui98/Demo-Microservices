package com.example.demo2.service;

import com.example.demo2.entity.Company;
import com.example.demo2.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class CompanySerivceImpl implements ICompanyService{
    private static List<Company> companies = new LinkedList<>();

    @Autowired
    public CompanySerivceImpl() {
        companies = CompanyRepository.getCompanies();
    }

    @Override
    public List<Company> getAllCompanies() {
        return companies;
    }

    @Override
    public Company getByName(String name) {
        if(companies.isEmpty() || Objects.isNull(name)){
            return new Company();
        }
        Optional<Company> existingEmployee = companies.stream().filter(com -> name.equals(com.getName())).findFirst();
        if (!existingEmployee.isPresent()) {
            System.out.println("============ COMPANY NOT FOUND ============");
        }
        return existingEmployee.get();
    }

    @Override
    public void updateCompany(Company company) {
        if(companies.isEmpty() || Objects.isNull(company)){
            return;
        }
        Company companyExisting = companies.stream().filter(com -> company.getName().equals(com.getName())).findFirst().get();
        if (!Objects.isNull(companyExisting)) {
            companyExisting.setDomain(company.getDomain());
            companyExisting.setLocation(company.getLocation());
            companyExisting.setName(company.getName());
            companyExisting.setYearEstablish(company.getYearEstablish());
            return;
        }else{
            System.out.println("======== Company Not Found =========");
        }
    }
}
