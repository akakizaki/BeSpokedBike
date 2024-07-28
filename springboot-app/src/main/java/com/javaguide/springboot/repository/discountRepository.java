package com.javaguide.springboot.repository;

import com.javaguide.springboot.entity.discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface discountRepository extends JpaRepository<discount, Long> {
}
