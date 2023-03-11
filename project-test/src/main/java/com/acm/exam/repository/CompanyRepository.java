package com.acm.exam.repository;

import org.springframework.data.repository.CrudRepository;

import com.acm.exam.model.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer>{

}
