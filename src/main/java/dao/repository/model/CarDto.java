package dao.repository.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CarDto {
    @NotEmpty(message = "Обязательное для заполнения")
    private String registeredCarNumber;
    @NotEmpty(message = "poshel nahui")
    private String engineType;
    private int yearOfIssue;
    private String brand;
    private String model;
    private int rentalDayPrice;
    private Long carClass;

}
