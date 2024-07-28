package com.javaguide.springboot.repository;

import com.javaguide.springboot.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;


//this simplifies the need to create code to perform common data access operation
//has built in crud operation
//reduces development time
public interface customerRepository extends JpaRepository<customer, Long> {
}
