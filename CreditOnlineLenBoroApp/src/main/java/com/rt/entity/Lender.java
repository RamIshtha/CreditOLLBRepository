package com.rt.entity;

import java.io.Serializable;

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
@Table(name = "LENDER")
@NoArgsConstructor
@RequiredArgsConstructor
public class Lender implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "LEN_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lenId;
	@Column(name = "LEN_NAME", length = 20)
	@NonNull
	private String lenName;
	@Column(name = "LEN_EMAIL", length = 20)
	@NonNull
	private String lenEmail;
	@Column(name = "LEN_MOBILE")
	@NonNull
	private Long lenMobile;
	@Column(name = "LENDING_AMOUNT")
	@NonNull
	private Integer lenAmount;
	@Column(name = "PROCESING_FEE")
	@NonNull
	private Integer processingFee;
}
