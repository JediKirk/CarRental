package service.impl;

import dao.entity.User;
import dao.repository.api.RoleRepository;
import dao.repository.api.UserRepository;
import dao.repository.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.api.RegistrationService;

@RequiredArgsConstructor
@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User registration(UserDto userDto) {
        User user = convertUser(userDto);
        user.setRole(roleRepository.getRoleById(2l));
        return userRepository.saveNewUser(user);
    }

    private User convertUser(UserDto userDto) {
        User user = new User();
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setPassword(userDto.getPassword());
        return user;
    }
}