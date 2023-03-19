package ua.com.alevel.service;

import ua.com.alevel.persistance.entity.Author;
import ua.com.alevel.persistance.entity.Book;

import java.util.Collection;

public interface BookService extends BaseService<Book> {
    void attachAuthorToBook(Author author, Book book);
    Collection<Book> findAllByAuthor(Long id);
}
