package dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "car_pick_up_location")
public class CarPickUpLocation extends BaseEntity {

    @ManyToMany(mappedBy = "")
    private Long carId;
    @Column(name = "pick_up_location_id")
    private Long pickUpLocationId;
}