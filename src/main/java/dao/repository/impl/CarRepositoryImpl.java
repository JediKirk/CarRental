package dao.repository.impl;

import dao.entity.Car;
import dao.repository.api.CarRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CarRepositoryImpl implements CarRepository {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public Optional<Car> getCarById(Long id) {
        return Optional.ofNullable(sessionFactory.getCurrentSession()
                .get(Car.class, id));
    }

    @Override
    @Transactional
    public Car saveCar(Car car) {
        sessionFactory.getCurrentSession()
                .save(car);
        return car;
    }
}