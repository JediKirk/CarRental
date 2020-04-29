package dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="car_class")
public class CarClass extends BaseEntity{
    @Column(name = "class")
    private String carClass;
    @Column(name = "transmission_type")
    private String transmissionType;
    @Column(name = "air_conditioning")
    private boolean airConditioning;
}
