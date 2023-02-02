package com.rt.service;

import com.rt.entity.Borrower;

public interface BorrowerService {
	public Borrower saveBorrower(Borrower borrower);
	public Iterable<Borrower> fetchAllBorrower();
}
