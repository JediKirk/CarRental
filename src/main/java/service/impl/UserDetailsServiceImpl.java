package service.impl;

import dao.entity.Address;
import dao.entity.UserDetails;
import dao.repository.api.UserDetailsRepository;
import dao.repository.api.UserRepository;
import dao.repository.model.UserDetailsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.api.UserDetailsService;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    protected UserDetails convertUserDetails(UserDetailsDto userDetailsDto) {
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName(userDetailsDto.getFirstName());
        userDetails.setSecondName(userDetailsDto.getSecondName());
        userDetails.setDateOfBirth(convertLocalDate(userDetailsDto.getDateOfBirth()));
        userDetails.setGender(userDetailsDto.getGender());
        userDetails.setUser(userRepository.findUserByPhoneNumber(userDetailsDto.getPhoneNumber()).get());
        Address address = new Address();
        address.setCountry(userDetailsDto.getCountry());
        address.setCity(userDetailsDto.getCity());
        address.setStreet(userDetailsDto.getStreet());
        address.setBuilding(userDetailsDto.getBuilding());
        userDetails.setAddress(address);
        userDetails.setApartment(userDetailsDto.getApartment());
        return userDetails;
    }

    private LocalDate convertLocalDate(String localDate) {
        List<Integer> date = new ArrayList<>();
        for (String retval : localDate.split("-")) {
            date.add(Integer.parseInt(retval));
        }
        return LocalDate.of(date.get(0), date.get(1), date.get(2));
    }

    private final UserDetailsRepository userDetailsRepository;
    @Override
    public UserDetails registrationDetails(UserDetailsDto userDetailsDto) {
        UserDetails userDetails = convertUserDetails(userDetailsDto);
        userDetailsRepository.save(userDetails);
        return userDetails;
    }

    @Override
    public UserDetails findUserDetailsByPhoneNumber(Long phoneNumber) {
        return userRepository.findUserByPhoneNumber(phoneNumber).get().getUserDetails();

    }
}
