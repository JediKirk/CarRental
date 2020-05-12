package dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Data
@Entity
@Table(name = "car_class")
public class CarClass extends BaseEntity {

    @OneToMany(mappedBy = "carClass")
    private List<Car> cars ;
    @Column(name = "transmission_type")
    private String transmissionType;
    @Column(name = "air_conditioning")
    private boolean airConditioning;
}