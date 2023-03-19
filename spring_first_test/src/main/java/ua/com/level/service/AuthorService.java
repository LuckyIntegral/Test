package ua.com.level.service;

import ua.com.level.persistance.entity.Author;
import ua.com.level.persistance.entity.Book;

import java.util.Collection;

public interface AuthorService extends BaseService<Author> {
    Collection<Book> findAllByBook(Long id);

}
