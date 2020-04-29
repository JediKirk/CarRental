package dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@Table(name="car_pick_up_location")
public class CarPickUpLocation extends BaseEntity {
    @Column(name = "car_id")
    private Long carId;
    @Column(name = "pick_up_location_id")
    private Long pickUpLocationId;
}
