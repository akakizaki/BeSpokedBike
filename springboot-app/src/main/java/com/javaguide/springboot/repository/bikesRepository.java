package com.javaguide.springboot.repository;

import com.javaguide.springboot.entity.Bikes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bikesRepository extends JpaRepository<Bikes, Long> {
    
}
