package dao.repository.impl;

import dao.entity.Role;
import dao.repository.api.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
public class RoleRepositoryImpl implements RoleRepository {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public Role getRoleById(Long id) {
        Role role = sessionFactory.getCurrentSession().
                get(Role.class, id);
        return role;
    }
}