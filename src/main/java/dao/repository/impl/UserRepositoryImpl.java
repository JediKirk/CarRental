package dao.repository.impl;

import dao.entity.User;
import dao.repository.api.UserRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public User saveNewUser(User user) {
        sessionFactory.getCurrentSession()
                .save(user);
        return user;
    }

    @Override
    @Transactional
    public Optional<User> findUserByPhoneNumber(Long phoneNumber) {
        return sessionFactory.getCurrentSession()
                .createQuery("from User where phoneNumber = :phone_number")
                .setParameter("phone_number", phoneNumber)
                .getResultList()
                .stream()
                .findFirst();
    }
}
