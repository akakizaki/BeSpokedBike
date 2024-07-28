package com.javaguide.springboot.services;

import com.javaguide.springboot.entity.Bikes;

import java.util.List;



public interface bikesService { //handles business logic for each entity
    List<Bikes> findAll();
    Bikes findById(Long id);
    Bikes save(Bikes bikes);
    void delete(Long id);
}
