package com.rt.restcontroler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
