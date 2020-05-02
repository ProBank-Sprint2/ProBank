package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.LoanDaoImpl;
import com.cg.entity.Loan;
import com.cg.exception.LMSException;

@Service

public class LoanServiceImpl {
	
	@Autowired
	
private LoanDaoImpl loanDao;
	
	
			public List<Loan> viewLoan(){
				return loanDao.viewLoan();
			}
			
			public Loan viewLoan(int accountId) throws LMSException {
				
			/*	
				
				Loan loan1=viewLoan(accountId);
				
				if(loan1!=null)
				{
					return loanDao.viewLoan(accountId);
				}
				else
					throw new LMSException("loan Number does not exist");
				
				
				*/
				return loanDao.viewLoan(accountId);
			}
			
			public String addLoan(Loan loan) {
				return loanDao.addLoan(loan);
			}
			
			public String deleteLoan(int accountId) {
				return loanDao.deleteLoan(accountId);
			}
			
			public String modifyLoan(Loan loan) throws LMSException {
				///////
				int accountId=loan.getAccountId();
				
				Loan loan1=viewLoan(accountId);
				
				if(loan1!=null)
				{
					return loanDao.modifyLoan(loan);
				}
				else
					throw new LMSException("loan Number does not exist");
				
				//////////
				//return loanDao.modifyLoan(loan);
			}
			

}
