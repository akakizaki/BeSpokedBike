package com.javaguide.springboot.repository;

import com.javaguide.springboot.entity.sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface saleRepository extends JpaRepository<sale, Long> {
}
