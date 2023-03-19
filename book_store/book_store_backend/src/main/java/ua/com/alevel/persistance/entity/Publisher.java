package ua.com.alevel.persistance.entity;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "publishers")
public class Publisher extends BaseEntity {
    private String name;
    @Enumerated(EnumType.STRING)
    private CountryCode country;
    public Publisher() {
        super();
    }
}
