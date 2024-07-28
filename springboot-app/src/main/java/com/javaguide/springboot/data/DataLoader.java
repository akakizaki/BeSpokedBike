package com.javaguide.springboot.data;

import com.javaguide.springboot.entity.*;
import com.javaguide.springboot.repository.bikesRepository;
import com.javaguide.springboot.repository.customerRepository;
import com.javaguide.springboot.repository.discountRepository;
import com.javaguide.springboot.repository.saleRepository;
import com.javaguide.springboot.repository.salesPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


//sampling data
@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private bikesRepository bikesRepository;

    @Autowired
    private salesPersonRepository salesPersonRepository;

    @Autowired
    private customerRepository customerRepository;

    @Autowired
    private saleRepository saleRepository;

    @Autowired
    private discountRepository discountRepository;

    @Override
    public void run(String... args) throws Exception {
        // Sample products
        Bikes smallBike = new Bikes("Unicycle", "Company A", "Small", 500.00, 450.00, 10, 0.10);
        Bikes mediumBike = new Bikes("Road Bike", "Company B", "Medium", 600.00, 550.00, 8, 0.15);
        Bikes largeBike = new Bikes("Road Bike", "Company C", "Large", 400.00, 350.00, 12, 0.12);

        bikesRepository.save(smallBike);
        bikesRepository.save(mediumBike);
        bikesRepository.save(largeBike);

        // Sample salespeople
        Salesperson aya = new Salesperson("Aya", "Kakizaki", "123 Elm St", "555-1234", LocalDate.of(2020, 1, 15), LocalDate.of(2022,1,2), "Manager");
        Salesperson anna = new Salesperson("Anna", "Johnson", "456 Oak St", "555-5678", LocalDate.of(2021, 5, 20), LocalDate.of(2022,1,2), "Sales Associate");
        Salesperson carol = new Salesperson("Carol", "Williams", "789 Pine St", "555-9012", LocalDate.of(2022, 9, 10), LocalDate.of(2022,1,2),"Sales Associate");

        salesPersonRepository.save(aya);
        salesPersonRepository.save(anna);
        salesPersonRepository.save(carol);

        // Sample customers
        customer cust1 = new customer("David", "Brown", "101 Maple St", "555-3456", LocalDate.of(2023, 6, 30));
        customer cust2 = new customer("Eva", "Davis", "202 Birch St", "555-7890", LocalDate.of(2023, 7, 15));
        customer cust3 = new customer("Frank", "Miller", "303 Cedar St", "555-2345", LocalDate.of(2023, 8, 25));

        customerRepository.save(cust1);
        customerRepository.save(cust2);
        customerRepository.save(cust3);

        // Sample sales
        saleRepository.save(new sale(smallBike, aya, cust1, LocalDate.of(2023, 6, 30)));
        saleRepository.save(new sale(mediumBike, anna, cust2, LocalDate.of(2023, 7, 15)));

        // Sample discounts
        discountRepository.save(new discount(smallBike, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 30), 0.10));
        discountRepository.save(new discount(mediumBike, LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 31), 0.15));
    }
}

