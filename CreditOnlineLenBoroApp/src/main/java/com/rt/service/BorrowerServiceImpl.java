package com.rt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dtos.BorrowerRegistrationDTO;
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

	@Override
	public String registerBorrower(BorrowerRegistrationDTO borrower) {
		Borrower newBorrower = new Borrower();
		newBorrower.setBorowId(borrower.getAadhaarNumber());
		newBorrower.setBorowName(borrower.getName());
		newBorrower.setBorowDob(borrower.getDob());
		newBorrower.setBorowEmail(borrower.getEmail());
		newBorrower.setBorowAddress(borrower.getAddress());
		newBorrower.setBorowNominee(borrower.getNominee());
		newBorrower.setBorowMobile(borrower.getMobile());
		newBorrower.setBorowScore(calculateScore(borrower.getAadhaarNumber()));
		newBorrower.setBorowEligibility(borrower.getSalary() / 2);
		newBorrower.setBorowActive(true);

		Integer id = repo.save(newBorrower).getBorowId();
		if (Optional.of(id).isPresent())
			return "Borrower with ID: " + id + " is registered successfuly...";
		else
			return "Borrower  registeration failed...";
	}

	private int calculateScore(int borowerId) {
		return 8000;
	}

}
