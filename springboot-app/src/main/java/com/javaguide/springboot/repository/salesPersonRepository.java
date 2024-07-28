package com.javaguide.springboot.repository;

import com.javaguide.springboot.entity.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface salesPersonRepository extends JpaRepository<Salesperson, Long> {
}
