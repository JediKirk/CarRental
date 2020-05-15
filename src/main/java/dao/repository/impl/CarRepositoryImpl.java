package dao.repository.impl;

import dao.entity.Car;
import dao.entity.CarClass;
import dao.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CarRepositoryImpl implements CarRepository {

    private final SessionFactory sessionFactory;

    @Override
    public Optional<Car> getCarById(Long id) {
        return sessionFactory.getCurrentSession()
                .createQuery("select e from " + "Car" + " e where e.id = :id", Car.class)
                .setParameter("id", id)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public Car saveCar(String registeredCarNumber,  String engineType, LocalDate yearOfIssue, String brand,
                       String model,  int rentalDayPrice, Long carClass) {
        Car car = new Car();
        car.setRegisteredCarNumber(registeredCarNumber);

        car.setEngineType(engineType);
        car.setYearOfIssue(yearOfIssue);
        car.setBrand(brand);
        car.setModel(model);
        car.setRentalDayPrice(rentalDayPrice);
        CarClass carClassEntity = getCarClass(carClass);
        car.setCarClass(carClassEntity);
        sessionFactory.getCurrentSession()
                .save(car);
        return car;
    }

    @Override
    public CarClass getCarClass(Long id){
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<CarClass> query = cb.createQuery(CarClass.class);
        Root<CarClass> root = query.from(CarClass.class);
        query.select(root).where(cb.equal(root.get("id"), id));
        return session.createQuery(query)
                .getResultList()
                .stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Car class not found"));
    }
}
