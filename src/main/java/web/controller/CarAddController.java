package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import service.api.CarAddService;


@Controller
@RequiredArgsConstructor
public class CarAddController {

    private final CarAddService carAddService;

    @GetMapping(path = "/car_add/{registeredCarNumber}/{engineType}/{yearOfIssue}/{brand}/{carModel}/{rentalDayPrice}/{carClass}")
    public String getNextStep(Model model, @PathVariable String registeredCarNumber, @PathVariable String engineType,
                              @PathVariable int yearOfIssue, @PathVariable String brand,
                              @PathVariable String carModel, @PathVariable int rentalDayPrice,
                              @PathVariable Long carClass) {
        carAddService.add(registeredCarNumber, engineType, yearOfIssue,
                brand, carModel, rentalDayPrice, carClass);
        return "redirect:/index.jsp";
    }
}
