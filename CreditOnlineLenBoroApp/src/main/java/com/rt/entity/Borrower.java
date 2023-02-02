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
@Table(name = "SP_DATA_BORROWER")
@NoArgsConstructor
@RequiredArgsConstructor
public class Borrower implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "BID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer borowId;
	@Column(name = "BNAME", length = 20)
	@NonNull
	private String borowName;
	@Column(name = "BDOB")
	@NonNull
	private LocalDate borowDob;
	@Column(name = "BEMAIL", length = 20)
	@NonNull
	private String borowEmail;
	@Column(name = "BADDRESS", length = 50)
	@NonNull
	private String borowAddress;
	@Column(name = "BNOMINEE", length = 20)
	@NonNull
	private String borowNominee;
	@Column(name = "BMOBILE")
	@NonNull
	private Long borowMobile;
	@Column(name = "SCORE")
	@NonNull
	private Integer borowScore;
	@Column(name = "ELIGIBILITY")
	@NonNull
	private Integer borowEligibility;
	@Column(name = "ACTIVE")
	@NonNull
	private Boolean borowActive;
}
