package com.javaguide.springboot.controller;

import com.javaguide.springboot.entity.customer;
import com.javaguide.springboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//crud interface for managing customers

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public customer getCustomerById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @PostMapping
    public customer createCustomer(@RequestBody customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/{id}")
    public customer updateCustomer(@PathVariable Long id, @RequestBody customer customer) {
        customer.setId(id);
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.delete(id);
    }
}

