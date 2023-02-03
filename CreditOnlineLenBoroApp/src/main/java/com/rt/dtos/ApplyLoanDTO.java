package com.rt.dtos;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ApplyLoanDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@NonNull
	private Integer borrowerId;
	@NonNull
	private Integer amount;
	@NonNull
	private Integer lenderId;

}
