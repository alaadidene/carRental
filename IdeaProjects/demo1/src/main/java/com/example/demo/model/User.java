package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType. IDENTITY )
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private String role; //USER, ADMIN
}
