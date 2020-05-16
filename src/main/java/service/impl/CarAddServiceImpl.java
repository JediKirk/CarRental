package service.impl;

import dao.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.api.CarAddService;


@RequiredArgsConstructor
@Service
public class CarAddServiceImpl implements CarAddService {

    private final CarRepository carRepository;

    @Override
    public void add(String registeredCarNumber, String engineType, int yearOfIssue,
                    String brand, String model, int rentalDayPrice, Long carClass) {
        carRepository.saveCar(registeredCarNumber, engineType, yearOfIssue,
                brand, model, rentalDayPrice, carClass);
    }
}
