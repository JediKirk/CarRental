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
    private String passportId;
    private LocalDate passportDateOfIssue;
    private LocalDate passport_expiry_date;
    private String placeOfBirthDay;
    private String countryOfResidence;
}
