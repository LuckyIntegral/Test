package ua.com.level.persistance.dao;

import ua.com.level.persistance.entity.Author;
import ua.com.level.persistance.entity.Book;

import java.util.Collection;

public interface BookDao extends BaseDao<Book> {
    Collection<Book> findAllByAuthor(Author author);
}
