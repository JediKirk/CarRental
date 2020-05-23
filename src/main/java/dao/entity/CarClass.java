package dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "car_class")
public class CarClass extends BaseEntity {

    @OneToMany(mappedBy = "carClass", fetch = FetchType.EAGER)
    private List<Car> cars ;

    @Column(name="class")
    private String carClass;
    @Column(name = "transmission_type")
    private String transmissionType;
    @Column(name = "air_conditioning")
    private boolean airConditioning;
}