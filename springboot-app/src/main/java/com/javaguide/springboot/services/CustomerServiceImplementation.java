package com.javaguide.springboot.services;

import com.javaguide.springboot.entity.customer;
import com.javaguide.springboot.repository.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    private customerRepository customerRepository;

    @Override
    public List<customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public customer findById(Long id) {
        Optional<customer> optionalCustomer = customerRepository.findById(id);
        return optionalCustomer.orElse(null);
    }

    @Override
    public customer save(customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}

