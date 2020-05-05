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

			



			public List<Loan> viewLoan(int loanId) throws BankException {
				List<Loan> loan1=loanDao.getLoan(loanId);
				
				if(loan1!=null)
				{
					return loanDao.getLoan(loanId);
				}
				else
					throw new BankException("loan Number does not exist");
				
			}
			
			public List<Loan> addLoan(Loan loan) {
				
				return loanDao.addLoan(loan);
			}
			
			public List<Loan> deleteLoan(int loanId) {
				return loanDao.deleteLoan(loanId);
			}
			
			public List<Loan> modifyLoan(Loan loan) throws BankException {
				
				int loanId=loan.getLoanId();
				
				List<Loan> loan1=viewLoan(loanId);
				
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
