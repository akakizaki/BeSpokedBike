package com.javaguide.springboot.controller;
import com.javaguide.springboot.entity.sale;

import com.javaguide.springboot.services.SaleServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//crud interface for managing sales

@RestController
@RequestMapping("/api/sales")
public class SaleController {
    @Autowired
    private SaleServiceImplementation salesService;

    @GetMapping
    public List<sale> getAllSales() {
        return salesService.findAll();
    }

    @GetMapping("/{id}")
    public sale getSalesById(@PathVariable Long id) {
        return salesService.findById(id);
    }

    @PostMapping
    public sale createSales(@RequestBody sale sales) {
        return salesService.save(sales);
    }

    @PutMapping("/{id}")
    public sale updateSales(@PathVariable Long id, @RequestBody sale sales) {
        sales.setId(id);
        return salesService.save(sales);
    }

    @DeleteMapping("/{id}")
    public void deleteSales(@PathVariable Long id) {
        salesService.delete(id);
    }
}
