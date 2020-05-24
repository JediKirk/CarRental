package service.impl;

import dao.entity.Car;
import dao.repository.api.CarClassRepository;
import dao.repository.api.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.api.CarService;
import dao.repository.model.CarDto;

import java.util.ArrayList;
import java.util.List;


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
    public void deleteById(Long id) {
         carRepository.deleteById(id);
    }

    @Override
    public List<Car> showAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car showCar(Long id) {
        return carRepository.findById(id).get();
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