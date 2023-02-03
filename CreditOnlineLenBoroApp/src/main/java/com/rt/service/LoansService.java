package com.rt.service;

import com.rt.dtos.EligibleLoansResponseDTO;
import com.rt.entity.Loans;

public interface LoansService {
	public Loans saveLoans(Loans loans);

	public Iterable<Loans> fetchAllLoans();

	public Iterable<EligibleLoansResponseDTO> fetchAllEligbleLoans(Integer bid);
}
