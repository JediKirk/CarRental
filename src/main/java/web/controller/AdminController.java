package web.controller;


import dao.repository.model.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import service.api.CarService;
import service.api.UserService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class AdminController {

    private final CarService carService;
    private final UserService userService;

    @PostMapping("/create-car")
    public String createCar(@Valid @ModelAttribute CarDto carDto, BindingResult bindingResult, Model model) {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (fieldErrors.isEmpty()) {
            carService.create(carDto);
            return "redirect:http://localhost:8080/CarRental_war_exploded/admin-panel";
        } else {
            model.addAttribute("binding", fieldErrors);
            return "add-car";
        }
    }

    @GetMapping(path = "/admin-car-info/{j}")
    public String adminCarInfo(Model model, @PathVariable Long j) {
        model.addAttribute("car", carService.showCar(j));
        return "forward:/admin-car-info";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteById(id);
        return "redirect:http://localhost:8080/CarRental_war_exploded/admin-panel";
    }

    @GetMapping("/admin-panel")
    public String adminPage(Model model,
                            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                            @RequestParam(value = "size", required = false, defaultValue = "9") Integer size) {
        model.addAttribute("cars", carService.showAllCars(page, size).getContent());
        model.addAttribute("totalPages", carService.showAllCars(page, size).getTotalPages());
        return "admin-panel";
    }


}



