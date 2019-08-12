package com.microservices2.exercise1.customer.controller;

import com.microservices2.exercise1.customer.model.Customer;
import com.microservices2.exercise1.customer.repository.CustomerRepository;
import com.microservices2.exercise1.customer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AccountService accountService;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping
    public Iterable<Customer> all(){
        return customerRepository.findAll();
    }

    @GetMapping(value = "/{customerId}")
    public Customer findByAccountId(@PathVariable final Integer customerId){
        Customer customer = customerRepository.findByCustomerId(customerId);
        customer.setAccount(accountService.findByCustomer(customerId));

        return customer;
    }

    @PutMapping
    public Customer update(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @DeleteMapping
    public void delete(@RequestBody Customer customer){
        customerRepository.delete(customer);
    }

}
