package com.acm.exam.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompany;
	
	@Column
	private String ruc;
	
	@Column
	private String businessName;
	
	@Column
	private String state;
	
	@OneToMany(mappedBy = "company")
	private List<Transaction> transactions;
	
	
	public Integer getIdCompany(){
		return idCompany;
	}
	
	public void setIdCompany(Integer idCompany){
		this.idCompany = idCompany;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Company [idCompany=" + idCompany + ", ruc=" + ruc + ", businessName=" + businessName + ", state="
				+ state + ", transactions=" + transactions + "]";
	}
	
	
	
}
