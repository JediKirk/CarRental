package dao.repository.api;

import dao.entity.Car;

import java.util.Optional;

public interface CarRepository {
    Optional<Car> getCarById(Long id);

    Car saveCar(Car car);
}