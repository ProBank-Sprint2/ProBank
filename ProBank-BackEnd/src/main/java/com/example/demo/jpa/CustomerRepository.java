/*
 * 
 * DAO for Customers 
 * JPA repository using lists to fetch/store/return data form Oracle Database
 * 
 */


package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Long> {
}