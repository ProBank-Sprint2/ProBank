package com.cg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="loandata")
@DynamicInsert
@DynamicUpdate
public class Loan {
	
	
	@Id
	@Column(name="loanId")
	@NotNull(message="Loan ID is Mandatory")
	private int loanId;

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
	    private String loanDisbursementStatus;


		public int getLoanId() {
			return loanId;
		}


		public double getAmount() {
			return amount;
		}


		public int getTenure() {
			return tenure;
		}


		public int getCreditScore() {
			return creditScore;
		}


		public double getRoi() {
			return roi;
		}


		public String getLoanType() {
			return loanType;
		}


		public String getLoanDisbursementStatus() {
			return loanDisbursementStatus;
		}


		public void setLoanId(int loanId) {
			this.loanId = loanId;
		}


		public void setAmount(double amount) {
			this.amount = amount;
		}


		public void setTenure(int tenure) {
			this.tenure = tenure;
		}


		public void setCreditScore(int creditScore) {
			this.creditScore = creditScore;
		}


		public void setRoi(double roi) {
			this.roi = roi;
		}


		public void setLoanType(String loanType) {
			this.loanType = loanType;
		}


		public void setLoanDisbursementStatus(String loanDisbursementStatus) {
			this.loanDisbursementStatus = loanDisbursementStatus;
		}


		@Override
		public String toString() {
			return "Loan [loanId=" + loanId + ", amount=" + amount + ", tenure=" + tenure + ", creditScore="
					+ creditScore + ", roi=" + roi + ", loanType=" + loanType + ", loanDisbursementStatus="
					+ loanDisbursementStatus + "]";
		}


		public Loan(@NotNull(message = "Loan ID is Mandatory") int loanId,
				@NotNull(message = "Amount is Mandatory") double amount,
				@NotNull(message = "TenureTime is Mandatory") int tenure,
				@NotNull(message = "Credit_score is Mandatory") int creditScore,
				@NotNull(message = "RateOfInterest is Mandatory") double roi,
				@NotNull(message = "Type is Mandatory") String loanType,
				@NotNull(message = "Status is Mandatory") String loanDisbursementStatus) {
			super();
			this.loanId = loanId;
			this.amount = amount;
			this.tenure = tenure;
			this.creditScore = creditScore;
			this.roi = roi;
			this.loanType = loanType;
			this.loanDisbursementStatus = loanDisbursementStatus;
		}


		public Loan() {
			super();
		}
		
		
		
		
		

		
		
		
}
