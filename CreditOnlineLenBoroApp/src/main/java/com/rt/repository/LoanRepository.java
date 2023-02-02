package com.rt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rt.entity.Loans;

@Repository
public interface LoanRepository extends CrudRepository<Loans, Integer> {

}
