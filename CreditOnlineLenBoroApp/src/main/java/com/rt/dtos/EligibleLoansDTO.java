package com.rt.dtos;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class EligibleLoansDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NonNull
	private Integer lenderId;
	@NonNull
	private String lenderName;
	@NonNull
	private Integer eligibleAmount;
	@NonNull
	private Integer processingFee;

}
