package dao.repository.impl;

import dao.entity.CarClass;
import dao.entity.User;
import dao.repository.api.UserRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    public User findUserByPhoneNumber(Long phoneNumber) {
        User user = sessionFactory.getCurrentSession().
                get(User.class, phoneNumber);
        return user;
        }
}
