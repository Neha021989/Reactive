package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>,QuerydslPredicateExecutor<Customer>,QuerydslBinderCustomizer<QCustomer> {

	
}
