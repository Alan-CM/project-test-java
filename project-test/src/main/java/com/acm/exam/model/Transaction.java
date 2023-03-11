package com.acm.exam.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransaction;

	@OneToOne(mappedBy = "transaction")
	private Answer answer;

	@Column
	private String nameDocument;

	@Column
	private Date dateRegistry;

	@Column
	private String state;

	@ManyToOne
	@JoinColumn(name = "id_company")
	private Company company;

	public Integer getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(Integer idTransaction) {
		this.idTransaction = idTransaction;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getNameDocument() {
		return nameDocument;
	}

	public void setNameDocument(String nameDocument) {
		this.nameDocument = nameDocument;
	}

	public Date getDateRegistry() {
		return dateRegistry;
	}

	public void setDateRegistry(Date dateRegistry) {
		this.dateRegistry = dateRegistry;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Transaction [idTransaction=" + idTransaction + ", idCompany=" + company.getIdCompany()
				+ ", nameDocument=" + nameDocument + ", dateRegistry=" + dateRegistry + ", state=" + state + "]";
	}

}
