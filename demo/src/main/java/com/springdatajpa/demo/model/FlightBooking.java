package com.springdatajpa.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "flight_bookings")
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer customerId;
    private Integer flightId;

    public FlightBooking(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }
}