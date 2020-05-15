package service.impl;

import dao.entity.Car;
import dao.repository.impl.CarRepositoryImpl;
import service.api.CarAddService;

import java.time.LocalDate;

public class CarAddServiceImpl implements CarAddService {
    @Override
    public Car add(String registeredCarNumber, String engineType,
                   LocalDate yearOfIssue, String brand, String model,
                   int rentalDayPrice, Long CarClass) {
        new CarRepositoryImpl()
    }
}
