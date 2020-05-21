package dao.repository.impl;

import dao.entity.UserDetails;
import dao.repository.api.UserDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
public class UserDetailsRepositoryImpl implements UserDetailsRepository {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public UserDetails saveUserDetails(UserDetails userDetails) {
        sessionFactory.getCurrentSession()
                .save(userDetails);
        return userDetails;
    }
}
