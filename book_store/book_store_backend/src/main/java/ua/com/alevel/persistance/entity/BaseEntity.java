package ua.com.alevel.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Temporal(TemporalType.TIMESTAMP )
    private  Date updated;

    public BaseEntity() {
        this.created = new Date();
        this.updated = new Date();
    }

    @ PreUpdate
    public void preUpdate() {
        this.updated = new Date();
    }
}
