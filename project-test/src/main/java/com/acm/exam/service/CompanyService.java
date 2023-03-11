package com.acm.exam.service;

import java.util.List;

import com.acm.exam.model.Company;

public interface CompanyService {

	public Company save(Company company);
	
	public List<Company> getLastThree();
}
