package com.cg.dto;

import com.cg.entity.Loan;

public class NewLoan {

	private Loan loan;

	public NewLoan(Loan loan) {
		super();
		this.loan = loan;
	}

	public NewLoan() {
		super();
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "NewLoan [loan=" + loan + "]";
	}
	
}
