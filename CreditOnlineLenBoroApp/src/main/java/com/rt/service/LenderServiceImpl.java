package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.Lender;
import com.rt.repository.LenderRepository;

@Service
public class LenderServiceImpl implements LenderService {

	@Autowired
	private LenderRepository repo;

	@Override
	public Lender saveLender(Lender lender) {
		Lender createdLender = repo.save(lender);
		return createdLender;
	}

	@Override
	public Iterable<Lender> fetchAllLender() {
		Iterable<Lender> lendersList = repo.findAll();
		return lendersList;
	}

}
