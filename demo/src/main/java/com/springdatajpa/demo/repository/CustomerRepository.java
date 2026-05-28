package com.springdatajpa.demo.repository;

import com.springdatajpa.demo.model.Customer;
import com.springdatajpa.demo.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByStatus(CustomerStatus status);

    List<Customer> findByTotalMilesFlownGreaterThan(Integer miles);
}