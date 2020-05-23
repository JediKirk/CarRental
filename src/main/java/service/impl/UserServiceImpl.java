package service.impl;

import dao.entity.Address;
import dao.entity.User;
import dao.entity.UserDetails;
import dao.repository.api.RoleRepository;
import dao.repository.api.UserDetailsRepository;
import dao.repository.api.UserRepository;
import dao.repository.model.UserDetailsDto;
import dao.repository.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.api.UserService;

import javax.transaction.Transactional;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    @Override
    public User registration(UserDto userDto) {
        User user = convertUser(userDto);
        user.setRole(roleRepository.findById(2l).get());
        return userRepository.save(user);
    }

    @Override
    public boolean signIn(UserDto userDto) {
        Optional<User> user = userRepository.findUserByPhoneNumber(userDto.getPhoneNumber());
        if (user.isPresent()) {
            return user.get().getPassword().equals(userDto.getPassword());
        }
       throw new RuntimeException();
    }

    User convertUser(UserDto userDto) {
        User user = new User();
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setPassword(userDto.getPassword());
        return user;
    }


}