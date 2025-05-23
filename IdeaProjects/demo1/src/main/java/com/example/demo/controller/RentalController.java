package com.example.demo.controller;

import com.example.demo.model.Rental;
import com.example.demo.service.RentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {
    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping
    public List<Rental> getAllRentals() {
        return rentalService.getAllRentals();
    }

    @PostMapping
    public Rental createRental(@RequestBody Rental rental) {
        return rentalService.saveRental(rental);
    }
    @DeleteMapping("/{id}")
    public void deleteRental(@PathVariable Long id) {
        rentalService.deleteRental(id);
    }
}

