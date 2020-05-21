package dao.repository.model;

import dao.entity.Address;
import dao.entity.Gender;
import lombok.Data;

@Data
public class UserDetailsDto {
    private String firstName;
    private String secondName;
    private String dateOfBirth;
    private Gender gender;
    private Long phoneNumber;
    private Address address;
    private String apartment;
}
