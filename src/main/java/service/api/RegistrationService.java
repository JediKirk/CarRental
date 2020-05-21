package service.api;

import dao.entity.User;
import dao.entity.UserDetails;
import dao.repository.model.UserDetailsDto;
import dao.repository.model.UserDto;

public interface RegistrationService {
    User registration(UserDto userDto);

    UserDetails registrationDetails(UserDetailsDto userDetailsDto);
}