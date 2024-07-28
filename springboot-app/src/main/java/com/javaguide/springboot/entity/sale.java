package com.javaguide.springboot.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Bikes bikes;
    @ManyToOne
    private Salesperson salesperson;
    @ManyToOne
    private customer customer;
    private LocalDate salesDate;
    private double price;
    private double commission;

    public sale(){

    }

    public sale(Bikes bikes, Salesperson salesPerson, com.javaguide.springboot.entity.customer customer, LocalDate salesDate) {
        this.bikes = bikes;
        this.salesperson = salesPerson;
        this.customer = customer;
        this.salesDate = salesDate;
    }
    // getters and setters

    public void setBikes(Bikes bikes) {
        this.bikes = bikes;
    }

    public Bikes getBikes() {
        return bikes;
    }

    public void setSalesDate(LocalDate salesDate) {
        this.salesDate = salesDate;
    }

    public LocalDate getSalesDate() {
        return salesDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public com.javaguide.springboot.entity.customer getCustomer() {
        return customer;
    }

    public double getCommission() {
        return commission;
    }

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public double getPrice() {
        return price;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setCustomer(com.javaguide.springboot.entity.customer customer) {
        this.customer = customer;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

}
