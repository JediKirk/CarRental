package service.api;

import dao.entity.Car;

import java.time.LocalDate;

public interface CarAddService {
    Car add(String registeredCarNumber, String bodyNumber, String engineType, LocalDate yearOfIssue, String brand,
            String model, int mileage, int priceAuto, int rentalDayPrice, Long CarClass);
}
