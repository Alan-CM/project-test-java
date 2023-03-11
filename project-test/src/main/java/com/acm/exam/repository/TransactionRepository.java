package com.acm.exam.repository;

import org.springframework.data.repository.CrudRepository;

import com.acm.exam.model.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer>{

}
