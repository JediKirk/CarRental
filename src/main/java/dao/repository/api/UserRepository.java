package dao.repository.api;

import dao.entity.User;

public interface UserRepository {
    User saveNewUser(User user);
}
