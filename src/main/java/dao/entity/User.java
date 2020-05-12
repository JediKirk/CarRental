package dao.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @Column(name = "phone_number", unique = true)
    private int phoneNumber;
    @Column
    private String password;
}
