package com.javaguide.springboot.entity;

import jakarta.persistence.*;

import java.time.LocalDate;



    @Entity
    @Table(name = "salespersons")
    public class Salesperson {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String firstName;
        private String lastName;
        private String address;
        private String phone;
        private LocalDate startDate;
        private LocalDate terminationDate;
        private String manager;


        public Salesperson() {
        }
        public Salesperson(String firstName, String lastName, String address, String phone, LocalDate startDate, LocalDate terminationDate, String manager) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.phone = phone;
            this.startDate = startDate;
            this.terminationDate = terminationDate;
            this.manager = manager;
        }
        // getters and setters


        public LocalDate getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public void setId(Long id) {
            this.id = id;
        }



        public Long getId() {
            return id;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getAddress() {
            return address;
        }


        public void setTerminationDate(LocalDate terminationDate) {
            this.terminationDate = terminationDate;
        }

        public LocalDate getTerminationDate() {
            return terminationDate;
        }

        public String getManager() {
            return manager;
        }

        public void setManager(String manager) {
            this.manager = manager;
        }



    }


