package com.javaguide.springboot.services;


import com.javaguide.springboot.entity.customer;

import java.util.List;

public interface CustomerService {
    List<customer> findAll();
    customer findById(Long id);
    customer save(customer customer);
    void delete(Long id);
}
