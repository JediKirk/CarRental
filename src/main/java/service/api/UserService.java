package service.api;

import dao.entity.User;
import dao.repository.model.UserDto;

public interface UserService {
    User registration(UserDto userDto);

    boolean signIn(UserDto userDto);
}