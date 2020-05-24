package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.api.CarService;
import dao.repository.model.CarDto;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final CarService carService;

    @PostMapping("/create-car")
    public String createCar(@ModelAttribute CarDto dto) {
        carService.create(dto);
        return "redirect:http://localhost:8080/CarRental_war_exploded/admin-panel";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteById(id);
        return "redirect:http://localhost:8080/CarRental_war_exploded/admin-panel";
    }

    @GetMapping(path = "/admin-car-info-{j}")
    public String carAdminInfo(Model model, @PathVariable Long j) {
        model.addAttribute("car", carService.showCar(j));
        return "forward:/car-info";
    }

}



