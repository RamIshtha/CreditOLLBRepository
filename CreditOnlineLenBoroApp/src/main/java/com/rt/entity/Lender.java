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
@Table(name = "SP_DATA_LENDER")
@NoArgsConstructor
@RequiredArgsConstructor
public class Lender implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "LID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lenId;
	@Column(name = "LNAME", length = 20)
	@NonNull
	private String lenName;
	@Column(name = "LEMAIL", length = 20)
	@NonNull
	private String lenEmail;
	@Column(name = "LMOBILE")
	@NonNull
	private Long lenMobile;
	@Column(name = "AMOUNT")
	@NonNull
	private String lenAddress;
}
