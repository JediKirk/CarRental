package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.api.CarService;
import service.model.CarDto;


@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;
    private final IndexController indexController;

    @PostMapping("/car_add")
    public String createCar(@ModelAttribute CarDto dto){
       carService.add(dto.getRegisteredCarNumber(),dto.getEngineType(),dto.getYearOfIssue(),
              dto.getBrand(),dto.getModel(),dto.getRentalDayPrice(),dto.getCarClass());
        return indexController.getIndexPage();
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
}
