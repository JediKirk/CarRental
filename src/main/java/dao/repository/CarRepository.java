package dao.repository;

import dao.entity.Car;
import dao.entity.CarClass;

import java.util.Optional;

public interface CarRepository {
    Optional<Car> getCarById(Long id);

    Car saveCar(String registeredCarNumber, String engineType, int yearOfIssue, String brand,
                String model, int rentalDayPrice, Long CarClass);

    CarClass getCarClass(Long id);
}