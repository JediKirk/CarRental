package dao.repository.model;

import lombok.Data;

@Data
public class CarDto {

    private String registeredCarNumber;
    private String engineType;
    private int yearOfIssue;
    private String brand;
    private String model;
    private int rentalDayPrice;
    private Long carClass;

}
