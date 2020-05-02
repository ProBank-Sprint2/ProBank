package com.cg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="loanmanagement")
@DynamicInsert
@DynamicUpdate
public class Loan {
	
	
	@Id
	@Column(name="accountId")
	@NotNull(message="Account ID is Mandatory")
	private int accountId;

		@Column(name="amount")
		@NotNull(message="Amount is Mandatory")
		private double amount;
	
		@Column(name="tenureTime")
		@NotNull(message="TenureTime is Mandatory")
		private int tenure;
	
		@Column(name="creditScore")
		@NotNull(message="Credit_score is Mandatory")
		private int creditScore;
	
		@Column(name="roi")
		@NotNull(message="RateOfInterest is Mandatory")
		private double roi;
	
		@Column(name="loanType")
		@NotNull(message="Type is Mandatory")
		private String loanType;
		
		
		@Column(name="loanDisbursementStatus")
		@NotNull(message="Status is Mandatory")
	    private String loanDisbumentStatus;
		
		public Loan() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getAccountId() {
			return accountId;
		}

		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public int getTenure() {
			return tenure;
		}

		public void setTenure(int tenure) {
			this.tenure = tenure;
		}

		public int getCreditScore() {
			return creditScore;
		}

		public void setCreditScore(int creditScore) {
			this.creditScore = creditScore;
		}

		public double getRoi() {
			return roi;
		}

		public void setRoi(double roi) {
			this.roi = roi;
		}

		public String getLoanType() {
			return loanType;
		}

		public void setLoanType(String loanType) {
			this.loanType = loanType;
		}

		public String getLoanDisbumentStatus() {
			return loanDisbumentStatus;
		}

		public void setLoanDisbumentStatus(String loanDisbumentStatus) {
			this.loanDisbumentStatus = loanDisbumentStatus;
		}

		public Loan(@NotNull(message = "Account ID is Mandatory") int accountId,
				@NotNull(message = "Amount is Mandatory") double amount,
				@NotNull(message = "TenureTime is Mandatory") int tenure,
				@NotNull(message = "Credit_score is Mandatory") int creditScore,
				@NotNull(message = "RateOfInterest is Mandatory") double roi,
				@NotNull(message = "Type is Mandatory") String loanType,
				@NotNull(message = "Status is Mandatory") String loanDisbumentStatus) {
			super();
			this.accountId = accountId;
			this.amount = amount;
			this.tenure = tenure;
			this.creditScore = creditScore;
			this.roi = roi;
			this.loanType = loanType;
			this.loanDisbumentStatus = loanDisbumentStatus;
		}
		
		
		
}
