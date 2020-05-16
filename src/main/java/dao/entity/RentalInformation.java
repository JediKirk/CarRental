package dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "rental_information")
public class RentalInformation extends BaseEntity {

    @Column(name = "date_of_issue")
    private LocalDate dateOfIssue;

    @Column(name = "rental_time")
    private int rentalTime;

    @Column(name = "return_date")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car carId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "rental_price")
    private int rentalPrice;

    @ManyToOne
    @JoinColumn(name = "pick_up_location_id")
    private PickUpLocation pickUpLocationId;

}
