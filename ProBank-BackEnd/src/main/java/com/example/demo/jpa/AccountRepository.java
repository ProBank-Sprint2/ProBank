/*
 * 
 * DAO for Accounts 
 * JPA repository using lists to fetch/store/return data form Oracle Database
 * 
 */

package com.example.demo.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Account;
import com.example.demo.model.Address;


public interface AccountRepository extends JpaRepository<Account, Long> {
	List<Account> findByCustomerId(Long customerId);

}
