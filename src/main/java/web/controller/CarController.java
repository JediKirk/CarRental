package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.api.CarService;
import dao.repository.model.CarDto;


@Controller
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @PostMapping("/create-car")
    public String createCar(@ModelAttribute CarDto dto) {
        carService.create(dto);
        return "redirect:http://localhost:8080/CarRental_war_exploded/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteById(id);
        return "index";
    }
}



