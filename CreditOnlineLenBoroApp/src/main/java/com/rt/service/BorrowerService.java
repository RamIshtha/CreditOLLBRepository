package com.rt.service;

import com.rt.dtos.BorrowerRegistrationDTO;
import com.rt.entity.Borrower;

public interface BorrowerService {
	public Borrower saveBorrower(Borrower borrower);

	public Iterable<Borrower> fetchAllBorrower();

	public String registerBorrower(BorrowerRegistrationDTO borrower);
}
