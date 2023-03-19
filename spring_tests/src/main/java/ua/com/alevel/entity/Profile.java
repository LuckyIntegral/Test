package ua.com.alevel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.TimeZoneStorage;
import org.hibernate.annotations.TimeZoneStorageType;
import ua.com.alevel.type.Gender;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "profiles")
public class Profile extends BaseEntity {
    @Column(name = "birth_day")
    @TimeZoneStorage(TimeZoneStorageType.NATIVE)
    private OffsetDateTime birthDay;

    @Column(name = "gender_type")
    @Enumerated(EnumType.STRING)
    private Gender genderType;

    @OneToOne
    private User user;

    public Profile() {
        super();
    }
}
