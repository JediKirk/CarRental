package dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "user_details")
public class UserDetails extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "sex")
    private String gender;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Embedded
    private Address address;

    private String apartment;

    @Column(name = "passport_id")
    private String passportId;

    @Column(name = "passport_date_of_issue")
    private LocalDate passportDateOfIssue;

    @Column(name = "passport_expiry_date")
    private LocalDate passport_expiry_date;

    @Column(name = "place_of_birthday")
    private String placeOfBirthDay;

    @Column(name = "country_of_residence")
    private String countryOfResidence;
}