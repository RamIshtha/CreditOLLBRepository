package com.rt.restcontroler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LenderController {
	
	@GetMapping("/getmsg")
	public String generateWM() {
		return "hi welcome!!";
	}

}
