package dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "car")
public class Car extends BaseEntity {

    @Column(name = "registered_car_number")
    private String registeredCarNumber;


    @Column(name = "engine_type")
    private String engineType;

    @Column(name = "year_of_issue")
    private Integer yearOfIssue;

    @Column
    private String brand;

    @Column
    private String model;

    @Column(name = "rental_day_price")
    private Integer rentalDayPrice;

    @ManyToOne
    @JoinColumn(name = "car_class_id")
    private CarClass carClass;

    @OneToMany(mappedBy = "pickUpLocationId")
    private List<RentalInformation> rentalInformation;

    @ManyToMany(mappedBy = "cars")
    private List<PickUpLocation> pickUpLocationPickUpLocations;

}