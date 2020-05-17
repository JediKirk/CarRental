package service.model;

import dao.entity.Address;
import lombok.Data;

@Data
public class PickUpLocationDto {
    private Address address;

}
