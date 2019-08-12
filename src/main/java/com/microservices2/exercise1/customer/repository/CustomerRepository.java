package com.microservices2.exercise1.customer.repository;

import com.microservices2.exercise1.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findByCustomerId(Integer customerId);
}
