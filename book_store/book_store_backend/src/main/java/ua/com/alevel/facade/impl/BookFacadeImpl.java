package ua.com.alevel.facade.impl;

import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import ua.com.alevel.dto.BookDTO;
import ua.com.alevel.dto.BookDetailsDTO;
import ua.com.alevel.facade.BookFacade;
import ua.com.alevel.persistance.entity.Book;
import ua.com.alevel.service.BookService;

import java.util.Collection;
import java.util.Collections;

@Service
@AllArgsConstructor
public class BookFacadeImpl implements BookFacade {

    private final BookService bookService;

    @Override
    public Collection<BookDTO> findAll() {
        Collection<Book> books = bookService.findAll();
        if (CollectionUtils.isNotEmpty(books)) {
            return books
                    .stream()
                    .map(BookDTO::new)
                    .toList();
        }
        return Collections.emptyList();
    }

    @Override
    public BookDetailsDTO findById(Long id) {
        return new BookDetailsDTO(bookService.findById(id));
    }
}
