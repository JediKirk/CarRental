package dao.repository.model;

import dao.entity.Address;
import dao.entity.User;
import lombok.Data;

import java.time.LocalDate;
@Data
public class UserDetailsDto {
    private String firstName;
    private String secondName;
    private LocalDate dateOfBirth;
    private String gender;
    private User user;
    private Address address;
    private String apartment;
}
