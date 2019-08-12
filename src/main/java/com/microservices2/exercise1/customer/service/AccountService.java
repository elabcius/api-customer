package com.microservices2.exercise1.customer.service;

import com.microservices2.exercise1.customer.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "api-account")
public interface AccountService {
    @GetMapping(value = "/account/customer/{customer}")
    List<Account> findByCustomer(@PathVariable("customer") Integer customer);
}
