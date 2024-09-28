package com.example.demo2.repository;

import com.example.demo2.entity.Company;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Component
public class CompanyRepository {
    private static final List<Company> companies = new LinkedList<>();

    public static List<Company> getCompanies() {
        companies.add(new Company("FPT", "Software", new Date(), "Vietnam"));
        companies.add(new Company("VNPT", "Telecomunication", new Date(), "Vietnam"));
        companies.add(new Company("LG", "Electronics", new Date(), "Korea"));
        companies.add(new Company("VNG", "Game", new Date(), "Vietnam"));
        return companies;
    }
}
