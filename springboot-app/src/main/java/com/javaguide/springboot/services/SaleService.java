package com.javaguide.springboot.services;

import com.javaguide.springboot.entity.sale;

import java.util.List;

public interface SaleService {
    List<sale> findAll();
    sale findById(Long id);
    sale save(sale sale);
    void delete(Long id);
}
