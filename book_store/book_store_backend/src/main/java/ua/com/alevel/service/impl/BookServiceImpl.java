package ua.com.alevel.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.alevel.persistance.repository.BookRepository;
import ua.com.alevel.service.BookService;
import ua.com.alevel.persistance.entity.Author;
import ua.com.alevel.persistance.entity.Book;

import java.util.Collection;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public void create(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public Collection<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void attachAuthorToBook(Author author, Book book) {

    }

    @Override
    public Collection<Book> findAllByAuthor(Long id) {
        return bookRepository.findAllByAuthors(id);
    }
}

