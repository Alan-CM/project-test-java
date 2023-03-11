package com.acm.exam.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acm.exam.model.Company;
import com.acm.exam.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public Company save(Company company) {
		
		Company companySaved = companyRepository.save(company);
		
		return companySaved;
	}

	@Override
	public List<Company> getLastThree() {
		 
		List<Company> companyList = new ArrayList<>();
		
		companyList = (ArrayList<Company>) companyRepository.findAll();
		
		Collections.sort(companyList, Collections.reverseOrder());
		
		List<Company> lastThreeCompanyList = new ArrayList<>();
		
		for(int i = 0; i < 3; i++){
			
			lastThreeCompanyList.add(companyList.get(i));
			
		}
		
		return lastThreeCompanyList;
	}

}
