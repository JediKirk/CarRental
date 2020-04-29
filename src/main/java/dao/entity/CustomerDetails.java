package dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name="customer_details")
public class CustomerDetails extends BaseEntity{
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "sex")
    private Sex sex;
    @Column(name = "phone_number_id")
    private Long phoneNumberId;
    @Embedded
    private Address address;
    private String apartment;
    @Column(name = "passport_id")
    private String passportId;
    @Column(name = "passport_date_of_issue")
    private LocalDate passportDateOfIssue;
    @Column(name = "passport_expiry_date")
    private LocalDate passportExpiryDate;
    @Column(name = "place_of_birthday")
    private String placeOfBirthday;
    @Column(name = "country_of_residence")
    private String countryOfResidence;

}