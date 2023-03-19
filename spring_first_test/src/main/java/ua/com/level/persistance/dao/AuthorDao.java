package ua.com.level.persistance.dao;

import ua.com.level.persistance.entity.Author;
import ua.com.level.persistance.entity.Book;

import java.util.Collection;

public interface AuthorDao extends BaseDao<Author> {
    Collection<Book> findAllByBook(Long id);
}
