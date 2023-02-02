package com.rt.restcontroler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Lender;
import com.rt.service.LenderService;

@RestController
@RequestMapping("/lender")
public class LenderController {

	@Autowired
	private LenderService service;

	@GetMapping("/getmsg")
	public String generateWM() {
		return "hi welcome!!";
	}

	@PostMapping("/createlender")
	public Lender saveLender(@RequestBody Lender lender) {
		Lender createdLender = service.saveLender(lender);
		return createdLender;
	}

	@GetMapping("/getlenders")
	public Iterable<Lender> getLender() {
		Iterable<Lender> lendersList = service.fetchAllLender();
		return lendersList;
	}

}
