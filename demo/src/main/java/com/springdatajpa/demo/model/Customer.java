package com.springdatajpa.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CustomerStatus status;

    private Integer totalMilesFlown;

    public Customer(String name, CustomerStatus status, Integer totalMilesFlown) {
        this.name = name;
        this.status = status;
        this.totalMilesFlown = totalMilesFlown;
    }
}