package dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "role")
public class Role extends BaseEntity{
    @Column(name = "phone_number_id")
    private Long phoneNumberId;
    @Column(name = "access_right")
    private AccessRight accessRight;
}
