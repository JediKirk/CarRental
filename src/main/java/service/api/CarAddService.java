package service.api;

public interface CarAddService {
    void add(String registeredCarNumber, String engineType, int yearOfIssue, String brand,
             String model, int rentalDayPrice, Long carClass);
}