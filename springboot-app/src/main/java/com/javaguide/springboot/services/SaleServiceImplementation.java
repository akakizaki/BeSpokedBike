package com.javaguide.springboot.services;


import com.javaguide.springboot.entity.sale;
import com.javaguide.springboot.repository.saleRepository;
import com.javaguide.springboot.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleServiceImplementation implements SaleService {

    @Autowired
    private saleRepository salesRepository;

    @Override
    public List<sale> findAll() {
        return salesRepository.findAll();
    }

    @Override
    public sale findById(Long id) {
        Optional<sale> optionalSales = salesRepository.findById(id);
        return optionalSales.orElse(null);
    }

    @Override
    public sale save(sale sales) {
        return salesRepository.save(sales);
    }

    @Override
    public void delete(Long id) {
        salesRepository.deleteById(id);
    }
}

