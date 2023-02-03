package com.rt.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "LOANS")
@NoArgsConstructor
@RequiredArgsConstructor
public class Loans {
	@Id
	@Column(name = "LID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer loanId;
	@Column(name = "LENDERID")
	@NonNull
	private Integer lenderID;
	@Column(name = "BORROWERID")
	@NonNull
	private Integer borrowerID;
	@Column(name = "LENDERNAME")
	@NonNull
	private String lenderName;
	@Column(name = "BORROWERNAME")
	@NonNull
	private String borrowerName;
	@Column(name = "AGREEMENTDATE")
	@NonNull
	private LocalDate agreementDate;	
	@Column(name = "LOANAMOUNT")
	@NonNull
	private Integer loanAmount;
	@Column(name = "PAIDAMOUNT")
	@NonNull
	private Integer paidAmount;
	@Column(name = "BALANCE_AMOUNT")
	@NonNull
	private Integer balanceAmount;
	@Column(name = "EMI_AMOUNT")
	@NonNull
	private Integer emiAmount;
	@Column(name = "EMIS")
	@NonNull
	private Integer emis;
	@Column(name = "PAID_EMIS")
	@NonNull
	private Integer paidEmis;
	@Column(name = "BALANCE_EMIS")
	@NonNull
	private Integer balanceEmis;	
	
}
