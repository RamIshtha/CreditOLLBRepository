package com.rt.restcontroler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.dtos.BorrowerRegistrationDTO;
import com.rt.entity.Borrower;
import com.rt.service.BorrowerService;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {

	@Autowired
	private BorrowerService service;

	@GetMapping("/getborrowers")
	public Iterable<Borrower> getBorrower() {
		Iterable<Borrower> borrowerList = service.fetchAllBorrower();
		return borrowerList;
	}

	@PostMapping("/createborrower")
	public Borrower saveBorrower(@RequestBody Borrower borrower) {
		Borrower createdBorrower = service.saveBorrower(borrower);
		return createdBorrower;
	}

	@PostMapping("/registerborrower")
	public String registerBorrower(@RequestBody BorrowerRegistrationDTO borrower) {
		String status = service.registerBorrower(borrower);
		return status;
	}

}
