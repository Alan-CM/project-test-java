package com.acm.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acm.exam.model.Company;
import com.acm.exam.service.CompanyService;
import com.acm.exam.service.CompanyServiceImpl;

@Controller
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/save")
	public ResponseEntity save(@RequestBody Company company) {
		
		Company companySave = companyService.save(company);
		
		return ResponseEntity.ok(companySave).accepted().build();
		
	}

	@GetMapping("/get")
	public ResponseEntity<List<Company>> getLastThree() {
		
		List<Company> companyGetLastThree = companyService.getLastThree();
		
		return ResponseEntity.ok(companyGetLastThree).ok().build();
		
	}
	
	
}
