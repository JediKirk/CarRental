package dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
    @Column(name = "car_id")
    private Long carId;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "rental_price")
    private int rentalPrice;
    @Column(name = "pick_up_location_id")
    private Long pickUpLocationId;
}
