package service.api;

import dao.entity.User;
import dao.repository.model.UserDto;

public interface RegistrationService {
    User registration(UserDto userDto);
}