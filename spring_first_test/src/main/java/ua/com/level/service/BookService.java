package ua.com.level.service;

import ua.com.level.persistance.entity.Author;
import ua.com.level.persistance.entity.Book;

import java.util.Collection;

public interface BookService extends BaseService<Book> {
    void attachAuthorToBook(Author author, Book book);
    Collection<Book> findAllByAuthor(Author author);
}
