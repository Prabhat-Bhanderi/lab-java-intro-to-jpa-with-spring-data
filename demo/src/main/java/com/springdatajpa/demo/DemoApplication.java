package com.springdatajpa.demo;

import com.springdatajpa.demo.model.*;
import com.springdatajpa.demo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepository customerRepo,
                          FlightRepository flightRepo,
                          FlightBookingRepository bookingRepo) {
        return args -> {
            // Customers
            Customer alice = customerRepo.save(new Customer("Alice", CustomerStatus.GOLD, 120000));
            Customer bob   = customerRepo.save(new Customer("Bob",   CustomerStatus.SILVER, 45000));
            Customer carol = customerRepo.save(new Customer("Carol", CustomerStatus.NONE,   8000));

            // Flights
            Flight f1 = flightRepo.save(new Flight("AB123", "Boeing 747",   300, 400));
            Flight f2 = flightRepo.save(new Flight("CD456", "Airbus A320",  180, 250));
            Flight f3 = flightRepo.save(new Flight("EF789", "Boeing 737",   160, 310));

            // Bookings
            bookingRepo.save(new FlightBooking(alice.getId(), f1.getId()));
            bookingRepo.save(new FlightBooking(bob.getId(),   f2.getId()));
            bookingRepo.save(new FlightBooking(carol.getId(), f3.getId()));
        };
    }
}