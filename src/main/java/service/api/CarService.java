package service.api;

import dao.entity.Car;
import dao.repository.model.CarDto;

public interface CarService {
    Car create(CarDto carDto);

    String deleteById(Long id);
}