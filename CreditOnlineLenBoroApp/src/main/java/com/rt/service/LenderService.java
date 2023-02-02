package com.rt.service;

import com.rt.entity.Lender;

public interface LenderService {
	public Lender saveLender(Lender lender);
	public Iterable<Lender> fetchAllLender();
}
