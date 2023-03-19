package ua.com.alevel.dto;

import com.neovisionaries.i18n.CountryCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublisherDTO {
    private Long id;
    private String name;
    private CountryCode country;
}
