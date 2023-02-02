package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.Loans;
import com.rt.repository.LoanRepository;

@Service
public class LoansServiceImpl implements LoansService {

	@Autowired
	private LoanRepository repo;

	@Override
	public Loans saveLoans(Loans loans) {
		Loans createdLoans = repo.save(loans);
		return createdLoans;
	}

	@Override
	public Iterable<Loans> fetchAllLoans() {
		Iterable<Loans> loansList = repo.findAll();
		return loansList;
	}

}
