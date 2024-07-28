package com.javaguide.springboot.services;

import com.javaguide.springboot.entity.Salesperson;

import com.javaguide.springboot.repository.salesPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalespersonServiceImplementation {

    @Autowired
    private salesPersonRepository salespersonRepository;

    public List<Salesperson> findAll() {
        return salespersonRepository.findAll();
    }

    public Salesperson findById(Long id) {
        Optional<Salesperson> optionalSalesperson = salespersonRepository.findById(id);
        return optionalSalesperson.orElse(null);
    }

    public Salesperson save(Salesperson salesperson) {
        return salespersonRepository.save(salesperson);
    }

    public void delete(Long id) {
        salespersonRepository.deleteById(id);
    }
}
