package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.entity.Loan;
import com.cg.exception.LMSException;
import com.cg.service.LoanServiceImpl;

@Component
@RestController
public class LoanController {
	
	@Autowired
	
	LoanServiceImpl loanService;
	
	
	
		@GetMapping("/loan")
		public List<Loan> viewLoan()
		{
			return loanService.viewLoan();
		}
		
		@GetMapping(value="/loan/{accounId}",produces= {"application/json"})
		public Loan viewLoan(@PathVariable int accountId) throws LMSException {
			return loanService.viewLoan(accountId);
		}
		
		@PostMapping(value="/loan/add",consumes={"application/json"})
		public String addLoan(@RequestBody Loan loan){
			return loanService.addLoan(loan);
		}

		@DeleteMapping("/loan/delete/{accountId}")
		public String deleteLoan(@PathVariable int accountId){
			return loanService.deleteLoan(accountId);
		}
		
		@PutMapping(value="/loan/modify",consumes= {"application/json"})
		public String modifyLoan(@RequestBody Loan loan) throws LMSException{
			return loanService.modifyLoan(loan);
		}

}
