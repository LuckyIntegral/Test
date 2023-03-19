package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class BookModel {
    private Long id;
    private String bookName;
    private String imageUrl;
    private Integer pageSize;
    private String price;
    private Integer publishDate;
    private String publisher;
    private Collection<String> authors;

}
