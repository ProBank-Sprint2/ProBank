package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.LoanDaoImpl;
import com.cg.entity.Loan;
import com.cg.exception.BankException;

@Service

public class LoanServiceImpl {
	
@Autowired
private LoanDaoImpl loanDao;

			



			public Loan viewLoan(int loanId) throws BankException {
				Loan loan1=loanDao.viewLoan(loanId);
				
				if(loan1!=null)
				{
					return loanDao.viewLoan(loanId);
				}
				else
					throw new BankException("loan Number does not exist");
				
			}
			
			public String addLoan(Loan loan) {
				
				return loanDao.addLoan(loan);
			}
			
			public String deleteLoan(int loanId) {
				return loanDao.deleteLoan(loanId);
			}
			
			public String modifyLoan(Loan loan) throws BankException {
				
				int loanId=loan.getLoanId();
				
				Loan loan1=viewLoan(loanId);
				
				if(loan1!=null)
				{
					return loanDao.modifyLoan(loan);
				}
				else
					throw new BankException("loan Number does not exist");
			}

			public List<Loan> viewLoan() {
				
				return loanDao.viewLoan();
			}
			

}
