package service.api;

import dao.entity.User;
import dao.entity.UserDetails;
import dao.repository.model.UserDetailsDto;
import dao.repository.model.UserDto;

import java.util.Optional;

public interface UserService {
    User registration(UserDto userDto);
    boolean signIn(UserDto userDto);
}