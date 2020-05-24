package service.api;

import dao.entity.Car;
import dao.repository.model.CarDto;

import java.util.List;

public interface CarService {
    Car create(CarDto carDto);
    void deleteById(Long id);
    List<Car> showAllCars();
    Car showCar(Long id);

}