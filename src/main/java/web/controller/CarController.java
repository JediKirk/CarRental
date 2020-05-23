package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.api.CarService;
import service.api.UserDetailsService;

@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    @GetMapping(path = "/car-info-{j}")
    public String carInfo(Model model, @PathVariable Long j){
        model.addAttribute("car",carService.showCar(j));
        return "forward:/car-info";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("cars", carService.showAllCars());
        return "index";
    }
}
