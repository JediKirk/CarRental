package dao.repository.api;

import dao.entity.User;


import java.util.Optional;

public interface UserRepository {
    User saveNewUser(User user);
    Optional<User> findUserByPhoneNumber(Long phoneNumber);
}
