package com.springdatajpa.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String flightNumber;
    private String aircraft;
    private Integer totalSeats;
    private Integer mileage;

    public Flight(String flightNumber, String aircraft, Integer totalSeats, Integer mileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalSeats = totalSeats;
        this.mileage = mileage;
    }
}