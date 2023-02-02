package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.Borrower;
import com.rt.repository.BorrowerRepository;

@Service
public class BorrowerServiceImpl implements BorrowerService {

	@Autowired
	private BorrowerRepository repo;

	@Override
	public Borrower saveBorrower(Borrower borrower) {
		Borrower createdBorrower = repo.save(borrower);
		return createdBorrower;
	}

	@Override
	public Iterable<Borrower> fetchAllBorrower() {
		Iterable<Borrower> borrowerList = repo.findAll();
		return borrowerList;
	}

}
