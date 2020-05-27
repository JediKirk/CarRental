package dao.repository.model;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CarDto {
    @NotEmpty(message = "Регистрационный номер- поле обязательное для заполнения")
    private String registeredCarNumber;
    @NotEmpty(message = "Тип двигателя - поле обязательное для заполнения")
    private String engineType;
    @Min(value = 1980, message = "Год выпуска не раньше 1980")
    @Max(value = 2020, message = "Год выпуска не позже 2020")
    @NotNull(message = "Год выпуска- поле обязательное для заполнения")
    private Integer yearOfIssue;
    @NotEmpty(message = "Брэнд - поле обязательное для заполнения")
    private String brand;
    @NotEmpty(message = "Модель - поле обязательное для заполнения")
    private String model;
    @NotNull(message = "Класс- поле обязательное для заполнения")
    private Long carClass;
    @NotNull(message = "Цена- поле обязательное для заполнения")
    private Integer rentalDayPrice;

}
