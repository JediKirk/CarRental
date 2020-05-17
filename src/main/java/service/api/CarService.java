package service.api;

import dao.entity.Car;

public interface CarService {
    Car add(String registeredCarNumber, String engineType, int yearOfIssue, String brand,
            String model, int rentalDayPrice, Long carClass);
}