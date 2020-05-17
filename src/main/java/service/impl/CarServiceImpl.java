package service.impl;

import dao.entity.Car;
import dao.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.api.CarService;


@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public Car add(String registeredCarNumber, String engineType, int yearOfIssue,
                   String brand, String model, int rentalDayPrice, Long carClass) {
        return     carRepository.saveCar(registeredCarNumber, engineType, yearOfIssue,
                brand, model, rentalDayPrice, carClass);

    }
}
