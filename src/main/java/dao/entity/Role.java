package dao.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "access_right")
    private AccessRight accessRight;
}