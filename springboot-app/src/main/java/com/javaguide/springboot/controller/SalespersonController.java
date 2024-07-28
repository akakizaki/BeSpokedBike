package com.javaguide.springboot.controller;

import com.javaguide.springboot.entity.Salesperson;

import com.javaguide.springboot.services.SalespersonServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



//crud interface for managing sales person
@RestController
@RequestMapping("/api/salespersons")
public class SalespersonController {

    @Autowired
    private SalespersonServiceImplementation salespersonService;

    @GetMapping
    public List<Salesperson> getAllSalespersons() {
        return salespersonService.findAll();
    }

    @GetMapping("/{id}")
    public Salesperson getSalespersonById(@PathVariable Long id) {
        return salespersonService.findById(id);
    }

    @PostMapping
    public Salesperson createSalesperson(@RequestBody Salesperson salesperson) {
        return salespersonService.save(salesperson);
    }

    @PutMapping("/{id}")
    public Salesperson updateSalesperson(@PathVariable Long id, @RequestBody Salesperson salesperson) {
        salesperson.setId(id);
        return salespersonService.save(salesperson);
    }

    @DeleteMapping("/{id}")
    public void deleteSalesperson(@PathVariable Long id) {
        salespersonService.delete(id);
    }
}
