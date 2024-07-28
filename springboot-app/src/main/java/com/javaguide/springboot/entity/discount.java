package com.javaguide.springboot.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;


@Entity
public class discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Bikes bikes;
    private LocalDate beginDate;
    private LocalDate endDate;
    private double discountPercentage;

    public discount(Bikes bikes, LocalDate beginDate, LocalDate endDate, double discountPercentage) {
        this.bikes = bikes;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.discountPercentage = discountPercentage;

    }
    // getters and setters


    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Bikes getBikes() {
        return bikes;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }



    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setBikes(Bikes bikes) {
        this.bikes = bikes;
    }


}

