package com.example.demo.view;

import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/web/cars")  // Préfixe différent de l'API
public class CarViewController {

    private final CarService carService;

    public CarViewController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String listCars(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "cars/list";
    }

    @GetMapping("/form")
    public String showForm(@RequestParam(required = false) Long id, Model model) {
        Car car = id != null ?
                carService.getCarById(id).orElse(new Car()) :
                new Car();
        model.addAttribute("car", car);
        return "cars/form";
    }

    @PostMapping("/save")
    public String saveCar(@ModelAttribute Car car) {
        carService.saveCar(car);
        return "redirect:/web/cars";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return "redirect:/web/cars";
    }
}