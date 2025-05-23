package com.example.demo.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue( strategy = GenerationType. IDENTITY )
    private Long id;
    @OneToOne

    private Rental rental;
    private LocalDate paymentDate;
    private double amount;
    private String method; //  CREDIT_CARD, CASH
    private String status; //PAID, PENDING, FAILED





}
