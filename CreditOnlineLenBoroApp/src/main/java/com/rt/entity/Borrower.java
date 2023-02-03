package com.rt.entity;

import java.io.Serializable;
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
@Table(name = "BORROWER")
@NoArgsConstructor
@RequiredArgsConstructor
public class Borrower implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BOROW_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer borowId;
	@Column(name = "BOROW_NAME", length = 20)
	@NonNull
	private String borowName;
	@Column(name = "BOROW_DOB")
	@NonNull
	private LocalDate borowDob;
	@Column(name = "BOROW_EMAIL", length = 20)
	@NonNull
	private String borowEmail;
	@Column(name = "BOROW_ADDRESS", length = 50)
	@NonNull
	private String borowAddress;
	@Column(name = "BOROW_NOMINEE", length = 20)
	@NonNull
	private String borowNominee;
	@Column(name = "BOROW_MOBILE")
	@NonNull
	private Long borowMobile;
	@Column(name = "BOROW_SCORE")
	@NonNull
	private Integer borowScore;
	@Column(name = "BOROW_ELIGIBILITY")
	@NonNull
	private Integer borowEligibility;
	@Column(name = "ACTIVE")
	@NonNull
	private Boolean borowActive;
}
