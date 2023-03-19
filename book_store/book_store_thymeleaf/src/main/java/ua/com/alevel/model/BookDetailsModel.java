package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDetailsModel extends BookModel{
    private String description;
    private Integer quantity;
}
