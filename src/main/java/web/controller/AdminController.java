package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import service.api.CarService;
import dao.repository.model.CarDto;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class AdminController {

    private final CarService carService;

    @PostMapping("/create-car")
    public String createCar(@Valid @ModelAttribute CarDto carDto , BindingResult bindingResult, Model model) {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (fieldErrors.isEmpty()) {
            carService.create(carDto);
            return "redirect:http://localhost:8080/CarRental_war_exploded/admin-panel";
        } else {
            fieldErrors.get(0).getDefaultMessage();
            model.addAttribute("binding",fieldErrors);
            return "add-car";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteById(id);
        return "redirect:http://localhost:8080/CarRental_war_exploded/admin-panel";
    }



}



