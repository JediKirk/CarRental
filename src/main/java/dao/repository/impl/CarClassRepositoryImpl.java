package dao.repository.impl;

import dao.entity.CarClass;
import dao.repository.api.CarClassRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@RequiredArgsConstructor
public class CarClassRepositoryImpl implements CarClassRepository {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public CarClass getCarClassById(Long id) {
        CarClass carClass = sessionFactory.getCurrentSession().
                get(CarClass.class, id);
        return carClass;
    }
}