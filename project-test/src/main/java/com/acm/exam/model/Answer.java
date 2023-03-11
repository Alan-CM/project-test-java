package com.acm.exam.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAnswer;
	
	@OneToOne
	@JoinColumn(name = "id_transaction")
	private Transaction transaction;
	
	@Column
	private String codeAnswer;
	
	@Column
	private String descriptionAnswer;
	
	@Column
	private Date dateAnswer;
	
	@Column
	private String state;
	
	
	
	public Integer getIdAnswer(){
		return idAnswer;
	}
	
	public void setIdAnswer(Integer idAnswer){
		this.idAnswer = idAnswer;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public String getCodeAnswer() {
		return codeAnswer;
	}

	public void setCodeAnswer(String codeAnswer) {
		this.codeAnswer = codeAnswer;
	}

	public String getDescriptionAnswer() {
		return descriptionAnswer;
	}

	public void setDescriptionAnswer(String descriptionAnswer) {
		this.descriptionAnswer = descriptionAnswer;
	}

	public Date getDateAnswer() {
		return dateAnswer;
	}

	public void setDateAnswer(Date dateAnswer) {
		this.dateAnswer = dateAnswer;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Answer [idAnswer=" + idAnswer + ", idTransaction=" + transaction.getIdTransaction() + ", codeAnswer=" + codeAnswer
				+ ", descriptionAnswer=" + descriptionAnswer + ", dateAnswer=" + dateAnswer + ", state=" + state + "]";
	}
	
	
	

}
