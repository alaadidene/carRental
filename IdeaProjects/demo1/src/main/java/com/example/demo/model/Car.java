package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Car")
public class Car {

    @Id
    @GeneratedValue( strategy = GenerationType. IDENTITY )
    private Long id;
    @Column(nullable = false)

    private String brand;
    @Column(nullable = false)

    private String model;
    @Column(nullable = false)

    private String registrationNumber;
    @Column(nullable = false)

    private String status;
    @Column(nullable = false)
// e.g., AVAILABLE, RENTED, MAINTENANCE
    private double pricePerDay;


}

