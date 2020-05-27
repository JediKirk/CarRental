package dao.entity;

import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "my-cache")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "access_right")
    private AccessRight accessRight;
}