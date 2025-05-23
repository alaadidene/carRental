package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Rental")
public class Rental {
    @Id
    @GeneratedValue( strategy = GenerationType. IDENTITY )
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Car car;

    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;
    private String status; //  ACTIVE, COMPLETED, CANCELLED


}
