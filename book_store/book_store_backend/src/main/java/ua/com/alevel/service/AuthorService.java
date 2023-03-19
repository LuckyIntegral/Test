package ua.com.alevel.service;

import ua.com.alevel.persistance.entity.Author;

import java.util.Collection;

public interface AuthorService extends BaseService<Author> {
    Collection<Author> findAllByBook(Long id);
}
