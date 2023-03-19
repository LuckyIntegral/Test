package ua.com.level.service.impl;

import org.springframework.stereotype.Service;
import ua.com.level.persistance.dao.AuthorDao;
import ua.com.level.persistance.entity.Author;
import ua.com.level.persistance.entity.Book;
import ua.com.level.service.AuthorService;

import java.util.Collection;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public Collection<Book> findAllByBook(Long id) {
        return authorDao.findAllByBook(id);
    }

    @Override
    public void create(Author author) {
        authorDao.create(author);
    }

    @Override
    public void update(Author author) {
        authorDao.update(author);
    }

    @Override
    public void delete(Long id) {
        authorDao.delete(id);
    }

    @Override
    public Author findById(Long id) {
        return authorDao.findById(id);
    }

    @Override
    public Collection<Author> findAll() {
        return authorDao.findAll();
    }
}
