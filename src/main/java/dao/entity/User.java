package dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @OneToOne(mappedBy = "user")
    private UserDetails userDetails;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
