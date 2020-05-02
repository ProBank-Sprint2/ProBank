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
		em.persist(loan);
		return "loan added successfully";
	}
	
	//view all loans
	public List<Loan> viewLoan()
	{
		Query query=em.createQuery("select loan from Loan loan");
		return query.getResultList();
	}

	//view specific loan
	public Loan viewLoan(int accountId)
	{
		List <Loan> list=viewLoan();
		Loan loan=null;
		Optional <Loan> optional=list.stream().
				filter(loan1->loan1.getAccountId()==accountId).findFirst();
		if(optional.isPresent()) {
			loan=optional.get();
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
