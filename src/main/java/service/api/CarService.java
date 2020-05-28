package service.api;

import dao.entity.Car;
import dao.repository.model.CarDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CarService {
    Car create(CarDto carDto);

    void deleteById(Long id);

  //  List<Car> showAllCars();

    Page<Car> showAllCars(int page,int size);

    Car showCar(Long id);

}