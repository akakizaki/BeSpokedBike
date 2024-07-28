package com.javaguide.springboot.controller;

import com.javaguide.springboot.entity.Bikes;
import com.javaguide.springboot.services.bikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//crud interface for managing bike products

@RestController
@RequestMapping("/api/products")
public class bikesController {
    @Autowired
    private bikesService bikesService; //create instance of bikerservice in this controller

    @GetMapping //http get requests to api/product
    public List<Bikes> getAllProducts() {
        return bikesService.findAll(); //returns the list
    }

    @GetMapping("/{id}")
    public Bikes getProductById(@PathVariable Long id) {
        return bikesService.findById(id);
    }

    @PostMapping
    public Bikes createBikes(@RequestBody Bikes bikes) {
        return bikesService.save(bikes);
    }

    @PutMapping("/{id}")
    public Bikes updateBikes(@PathVariable Long id, @RequestBody Bikes bikes) {
        bikes.setId(id);
        return bikesService.save(bikes);
    }

    @DeleteMapping("/{id}")
    public void deleteBikes(@PathVariable Long id) {
        bikesService.delete(id);
    }
}


