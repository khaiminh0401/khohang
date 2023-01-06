package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.customer;

public interface CustomerRepository extends JpaRepository<customer, Integer>{

}
