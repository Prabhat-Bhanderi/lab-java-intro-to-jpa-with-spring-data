package com.springdatajpa.demo.repository;

import com.springdatajpa.demo.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}