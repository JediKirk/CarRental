package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.api.CarService;
import service.api.UserService;

import javax.servlet.http.HttpSession;


@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    private final UserService userService;
    @GetMapping(path = "/car-info-{j}")
    public String carInfo(Model model, @PathVariable Long j){
        model.addAttribute("car",carService.showCar(j));
        return "forward:/car-info";
    }

    @GetMapping(path = "/admin-car-info-{j}")
    public String adminCarInfo(Model model, @PathVariable Long j){
        model.addAttribute("car",carService.showCar(j));
        return "forward:/admin-car-info";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(Model model) {
        model.addAttribute("cars", carService.showAllCars());
        return "index";
    }

    @RequestMapping(value = "/admin-panel", method = RequestMethod.GET)
    public String adminPage(Model model) {
        model.addAttribute("cars", carService.showAllCars());
        return "admin-panel";
    }
}
