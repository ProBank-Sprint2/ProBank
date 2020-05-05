package com.cg.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Loan;


@Repository
@Transactional
public class LoanDaoImpl {
	
	@PersistenceContext
	EntityManager em;
	
	//adding new loan
	public List<Loan> addLoan(Loan loan)
	{
		System.out.println(loan.toString());
		em.persist(loan);
		return viewLoan();
	}
	
	//view all loans
	@SuppressWarnings("unchecked")
	public List<Loan> viewLoan()
	{
		Query query=em.createQuery("select loan from Loan loan");
		return query.getResultList();
	}

	//view specific loan
	public List<Loan> getLoan(int loanId)
	{
		Query query=em.createQuery("select l from Loan l where l.loanId=:id");
		query.setParameter("id", loanId);
		@SuppressWarnings("unchecked")
		List<Loan> list=query.getResultList();
		
		return list;
	}
	
	//removing unwanted loan
	public List<Loan> deleteLoan(int accountId) {
		em.remove(getLoan(accountId).get(0));
		return viewLoan();
	}
	
	
	//modify loan details
	public List<Loan> modifyLoan(Loan loan) {
		em.merge(loan);
		return viewLoan();
	}

}
