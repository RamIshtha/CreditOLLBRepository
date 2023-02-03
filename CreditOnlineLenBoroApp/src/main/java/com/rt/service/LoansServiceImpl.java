package com.rt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dtos.EligibleLoansResponseDTO;
import com.rt.entity.Lender;
import com.rt.entity.Loans;
import com.rt.repository.BorrowerRepository;
import com.rt.repository.LenderRepository;
import com.rt.repository.LoanRepository;

@Service
public class LoansServiceImpl implements LoansService {

	@Autowired
	private LoanRepository loanRepo;

	@Autowired
	private BorrowerRepository borrowerRepo;

	@Autowired
	private LenderRepository lenderRepo;

	@Override
	public Loans saveLoans(Loans loans) {
		Loans createdLoans = loanRepo.save(loans);
		return createdLoans;
	}

	@Override
	public Iterable<Loans> fetchAllLoans() {
		Iterable<Loans> loansList = loanRepo.findAll();
		return loansList;
	}

	@Override
	public Iterable<EligibleLoansResponseDTO> fetchAllEligbleLoans(Integer bid) {
		List<EligibleLoansResponseDTO> eligibleLoanList = new ArrayList<EligibleLoansResponseDTO>();
		int eligibleAmount = 0;
		if (borrowerRepo.existsById(bid))
			eligibleAmount = borrowerRepo.findById(bid).get().getBorowEligibility();

		for (Lender lender : lenderRepo.findAll()) {
			// if (lender.getLenAmount() >= eligibleAmount) {
			EligibleLoansResponseDTO dto = new EligibleLoansResponseDTO();
			dto.setLenderId(lender.getLenId());
			dto.setLenderName(lender.getLenName());
			dto.setEligibleAmount(eligibleAmount);
			dto.setProcessingFee(10000);
			eligibleLoanList.add(dto);
			// }
		}
		return eligibleLoanList;
	}

}
