package com.rt.restcontroler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.dtos.EligibleLoansResponseDTO;
import com.rt.entity.Loans;
import com.rt.service.LoansService;

@RestController
@RequestMapping("/loans")
public class LoansController {

	@Autowired
	private LoansService service;

	@PostMapping("/createloans")
	public Loans saveLoans(@RequestBody Loans loans) {
		Loans createdLoans = service.saveLoans(loans);
		return createdLoans;
	}

	@GetMapping("/getloans")
	public Iterable<Loans> getLoans() {
		Iterable<Loans> loansList = service.fetchAllLoans();
		return loansList;
	}
	
	@GetMapping("/geteligbleloans/{bid}")
	public Iterable<EligibleLoansResponseDTO> getEligibleLoans(@PathVariable Integer bid) {
		Iterable<EligibleLoansResponseDTO> loansList = service.fetchAllEligbleLoans(bid);
		return loansList;
	}

}
