package com.rt.dtos;

import java.io.Serializable;
import java.time.LocalTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class BorrowerRegistrationDTO implements Serializable{
	private static final long serialVersionUID = 1L;	
	@NonNull
	private String name;
	@NonNull
	private LocalTime	dob;
	@NonNull
	private String email;	
	@NonNull
	private String address	;
	@NonNull
	private String nominee;
	@NonNull
	private Long mobile;
	@NonNull
	private Integer salary;
	@NonNull
	private Integer aadhaarNumber;
}
