package ua.com.level.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "books")
public class Book extends BaseEntity {
    @Column(name = "book_name", nullable = false)
    private String bookName;
    @Column(columnDefinition = "TEXT")
    private String descriptions;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "page_size")
    private Integer pageSize;
    @Column(name = "publish_date ")
    private Integer publishDate;
    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;
    public Book() {
        super();
        authors = new HashSet<>();
    }
}
