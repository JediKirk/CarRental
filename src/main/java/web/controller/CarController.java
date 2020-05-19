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

// car_add/?registeredCarNumber=4231&engineType=1&yearOfIssue=1&brand=1&carModel=1&rentalDayPrice=1&carClass=1
//    @GetMapping(path = "/car_add/?registeredCarNumber={registeredCarNumber}&engineType={engineType}&yearOfIssue={yearOfIssue}&brand={brand}&carModel={carModel}&rentalDayPrice={rentalDayPrice}&carClass={carClass}")
//    public String getNextStep(Model model, @PathVariable String registeredCarNumber, @PathVariable String engineType,
//                              @PathVariable int yearOfIssue, @PathVariable String brand,
//                              @PathVariable String carModel, @PathVariable int rentalDayPrice,
//                              @PathVariable Long carClass) {
//        carAddService.add(registeredCarNumber, engineType, yearOfIssue,
//                brand, carModel, rentalDayPrice, carClass);
//        return "redirect:/hello";
//    }

