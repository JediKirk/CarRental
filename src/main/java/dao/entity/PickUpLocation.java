package dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "pick_up_location")
public class PickUpLocation extends BaseEntity {
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "pickUpLocationId")
    private List<RentalInformation> rentalInformation;

    @ManyToMany
    @JoinTable(name = "car_pick_up_location",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "pick_up_location_id")
    )
    private List<Car> cars;
}
