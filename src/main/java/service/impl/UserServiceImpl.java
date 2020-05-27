package service.impl;

import dao.entity.User;
import dao.repository.api.RoleRepository;
import dao.repository.api.UserRepository;
import dao.repository.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import service.api.UserService;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {
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


    @Override
    public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {
        User loadedUser = userRepository.findUserByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new UsernameNotFoundException("Can't find user by provided name!"));

        return new org.springframework.security.core.userdetails.User(loadedUser.getPhoneNumber(), loadedUser.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(loadedUser.getRole().getAccessRight())));
    }
}