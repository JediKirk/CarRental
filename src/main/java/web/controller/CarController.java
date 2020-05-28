package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.api.CarService;


@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping(path = "/car-info/{j}")
    public String carInfo(Model model, @PathVariable Long j) {
        model.addAttribute("car", carService.showCar(j));
        return "forward:/car-info";
    }



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(Model model) {
        model.addAttribute("cars", carService.showAllCars());
        return "index";
    }

}
