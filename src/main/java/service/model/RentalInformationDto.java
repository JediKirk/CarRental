package service.model;

import dao.entity.Car;
import dao.entity.PickUpLocation;
import dao.entity.User;

import java.time.LocalDate;

public class RentalInformationDto {

    private LocalDate dateOfIssue;
    private int rentalTime;
    private LocalDate returnDate;
    private Car carId;
    private User user;
    private int rentalPrice;
    private PickUpLocation pickUpLocationId;
}
