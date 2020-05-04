package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.NewLoan;
import com.cg.entity.Loan;
import com.cg.exception.BankException;
import com.cg.service.LoanServiceImpl;

@RestController
@CrossOrigin("http://localhost:4200")
public class LoanController {
	
	@Autowired
	
	LoanServiceImpl loanService;
	
	
	
		@GetMapping("/loan")
		public List<Loan> viewLoan()
		{
			return loanService.viewLoan();
		}
		
		@GetMapping(value="/loan/{loanId}",produces= {"application/json"})
		public Loan viewLoan(@PathVariable int loanId) throws BankException {
			return loanService.viewLoan(loanId);
		}
		
		@PostMapping(value="/loan/add",consumes = {"application/json"})
		public String addLoan(@RequestBody NewLoan loan){
			return loanService.addLoan(loan.getLoan());
		}

		@DeleteMapping("/loan/delete/{loanId}")
		public String deleteLoan(@PathVariable int loanId){
			return loanService.deleteLoan(loanId);
		}
		
		@PutMapping(value="/loan/modify",consumes= {"application/json"})
		public String modifyLoan(@RequestBody NewLoan loan) throws BankException{
			
			
			return loanService.modifyLoan(loan.getLoan());
		}

}
