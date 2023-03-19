package ua.com.alevel.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.collections4.CollectionUtils;
import ua.com.alevel.persistance.entity.Author;

import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
public class AuthorDetailsDTO extends AuthorDTO {
    private Collection<BookDTO> books;

    public AuthorDetailsDTO() {}

    public AuthorDetailsDTO(Author author) {
        super(author);
        if (CollectionUtils.isNotEmpty(author.getBooks())) {
            this.books = author.getBooks()
                    .stream()
                    .map(BookDTO::new)
                    .toList();
        } else {
            this.books = Collections.emptyList();
        }
    }
}
