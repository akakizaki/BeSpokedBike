package com.javaguide.springboot.services;

import com.javaguide.springboot.entity.Bikes;
import com.javaguide.springboot.repository.bikesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class bikesServiceImplementation implements bikesService {
    @Autowired
    private bikesRepository bikesRepository;

    @Override
    public List<Bikes> findAll() {
        return bikesRepository.findAll();
    }

    @Override
    public Bikes findById(Long id) {
        return bikesRepository.findById(id).orElse(null);
    }

    @Override
    public Bikes save(Bikes bikes) {
        return bikesRepository.save(bikes);
    }

    @Override
    public void delete(Long id) {
        bikesRepository.deleteById(id);
    }
}
