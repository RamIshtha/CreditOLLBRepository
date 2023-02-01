package com.rt.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

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
	private Integer b_id;
	@Column(name = "BNAME", length = 20)
	@NonNull
	private String b_name;
	@Column(name = "BEMAIL", length = 20)
	@NonNull
	private String b_email;
	@Column(name = "BADDRESS", length = 50)
	@NonNull
	private String b_address;
	@Column(name = "BNOMINEE", length = 20)
	@NonNull
	private String b_nominee;
	@Column(name = "BMOBILE")
	@NonNull
	private Long b_mobile;
	@Column(name = "BDATE")
	@NonNull
	private LocalDateTime borrowedDate;
	@Column(name = "SCORE")
	@NonNull
	private Integer b_score;
	@Column(name = "ELIGIBILITY")
	@NonNull
	private Integer b_eligibility;
	@Column(name = "ACTIVE")
	@NonNull
	private Boolean b_active;
}
