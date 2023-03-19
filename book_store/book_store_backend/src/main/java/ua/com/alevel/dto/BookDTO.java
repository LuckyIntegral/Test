package ua.com.alevel.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;
import ua.com.alevel.persistance.entity.Author;
import ua.com.alevel.persistance.entity.Book;
import ua.com.alevel.persistance.entity.Publisher;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
public class BookDTO {
    private Long id;
    private String bookName;
//    private String descriptions;
    private String imageUrl;
    private Integer pageSize;
    private String price;
    private Integer publishDate;
    private Integer quantity;
    private String publisher;
    private Collection<String> authors;

    public BookDTO() {}

    public BookDTO(Book book) {
        this.id = book.getId();
        this.bookName = book.getBookName();
//        this.descriptions = book.getDescriptions();
        this.imageUrl = book.getImageUrl();
        this.pageSize = book.getPageSize();
        this.publishDate = book.getPublishDate();
        this.price = book.getPrice().toString();
        this.quantity = book.getQuantity();
        Publisher publisher1 = book.getPublisher();
        if (publisher1 != null) {
            this.publisher = publisher1.getName();
        }
        Set<Author> authorSet = book.getAuthors();
        if (CollectionUtils.isNotEmpty(authorSet)) {
            this.authors = authorSet
                    .stream()
                    .map(n -> n.getFirstName().concat(" ").concat(n.getLastName()))
                    .toList();
        }
    }
}
