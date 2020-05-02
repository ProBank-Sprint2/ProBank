package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.LoanDaoImpl;
import com.cg.entity.Loan;

@SpringBootApplication
public class ProBankApplication implements CommandLineRunner  {
	
	@Autowired
	LoanDaoImpl loandao;

	public static void main(String[] args) {
		SpringApplication.run(ProBankApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome");
		

		Loan l=new Loan(106,5000,24,700,8.5,"Business","Pending");
		
	loandao.addLoan(l);
	System.out.println("Inserted");
		

}
}
