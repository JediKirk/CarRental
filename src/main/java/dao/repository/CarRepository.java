package dao.repository;

import dao.entity.Car;
import dao.entity.CarClass;
import dao.entity.PickUpLocation;
import dao.entity.RentalInformation;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CarRepository {
    Optional<Car> getCarById (Long id);

    Car saveCar(String registeredCarNumber,  String engineType, LocalDate yearOfIssue, String brand,
                String model,  int rentalDayPrice, Long CarClass);

    CarClass getCarClass(Long id);
}
