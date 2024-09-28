package com.example.demo2.controller;

import com.example.demo2.entity.Company;
import com.example.demo2.service.CompanySerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanySerivceImpl companySerivce;

    @GetMapping("/")
    public ResponseEntity<List<Company>> getCompanies() {
        return new ResponseEntity<>(companySerivce.getAllCompanies(), HttpStatus.OK);
    }

    @PutMapping("/{name}")
    public ResponseEntity<Company> getCompanyByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(companySerivce.getByName(name), HttpStatus.OK);
    }
}
