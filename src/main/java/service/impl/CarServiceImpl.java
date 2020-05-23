package service.impl;

import dao.entity.Car;
import dao.repository.api.CarClassRepository;
import dao.repository.api.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.api.CarService;
import dao.repository.model.CarDto;


@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarClassRepository carClassRepository;

    @Override
    public Car create(CarDto carDto) {
        Car car = convertDto(carDto);
        car.setCarClass(carClassRepository.findById(carDto.getCarClass()).get());
        return carRepository.save(car);
    }

    @Override
    public String deleteById(Long id) {
        return null;
    }

    private Car convertDto(CarDto carDto) {
        Car car = new Car();
        car.setRegisteredCarNumber(carDto.getRegisteredCarNumber());
        car.setEngineType(carDto.getEngineType());
        car.setYearOfIssue(carDto.getYearOfIssue());
        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setRentalDayPrice(carDto.getRentalDayPrice());
        return car;
    }


}