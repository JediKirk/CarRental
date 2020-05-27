package web.controller;

import dao.entity.Car;
import dao.repository.api.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.api.CarService;

import java.util.stream.IntStream;


@Controller
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping(path = "/car-info-{j}")
    public String carInfo(Model model, @PathVariable Long j) {
        model.addAttribute("car", carService.showCar(j));
        return "forward:/car-info";
    }



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexPage(Model model) {
        model.addAttribute("cars", carService.showAllCars());
        return "index";
    }

//    @GetMapping("/pagination")
//    public String listCars(
//            Model model,
//            @RequestParam(value = "size",required = false,defaultValue = "0") Integer size,
//            @RequestParam(value = "size",required = false,defaultValue = "7") Integer page
//    ){
//        Page<Car> pageCars=carRepository.findAll(PageRequest.of(page,size));
//        model.addAttribute("pageCars",pageCars);
//        model.addAttribute("numbers", IntStream.range(0,pageCars.getTotalPages()).toArray());
//        return "indexpage";
//    }


}
