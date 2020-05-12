package dao.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "role")
public class Role extends BaseEntity {
    @OneToOne(mappedBy = "phoneNumber")
    private User user;
    @Column(name = "access_right")
    private AccessRight accessRight;
}
