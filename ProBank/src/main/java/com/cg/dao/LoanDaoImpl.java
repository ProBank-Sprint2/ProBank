package com.cg.dao;


import java.util.List;
import java.util.Optional;

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
	public String addLoan(Loan loan)
	{
		System.out.println(loan.toString());
		em.persist(loan);
		return "loan added successfully";
	}
	
	//view all loans
	@SuppressWarnings("unchecked")
	public List<Loan> viewLoan()
	{
		Query query=em.createQuery("select loan from Loan loan");
		return query.getResultList();
	}

	//view specific loan
	public Loan viewLoan(int loanId)
	{
		Query query=em.createQuery("select l from Loan l where l.loanId=:id");
		query.setParameter("id", loanId);
		@SuppressWarnings("unchecked")
		List<Loan> list=query.getResultList();
		Loan loan = null;
        Optional<Loan> opt = list.stream()
                                .filter( c -> c.getLoanId()==(loanId))
                                .findFirst();
        if(opt.isPresent()) {
            loan= opt.get();
        }
		return loan;
	}
	
	//removing unwanted loan
	public String deleteLoan(int accountId) {
		em.remove(viewLoan(accountId));
		return "loan deleted successfully";
	}
	
	
	//modify loan details
	public String modifyLoan(Loan loan) {
		em.merge(loan);
		return "loan updated successfully";
	}

}
