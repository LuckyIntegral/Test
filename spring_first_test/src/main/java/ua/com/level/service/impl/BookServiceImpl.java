package ua.com.level.service.impl;

import org.springframework.stereotype.Service;

import ua.com.level.persistance.dao.BookDao;
import ua.com.level.persistance.entity.Author;
import ua.com.level.persistance.entity.Book;
import ua.com.level.service.BookService;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void create(Book book) {
        bookDao.create(book);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public void delete(Long id) {
        bookDao.delete(id);
    }

    @Override
    public Book findById(Long id) {
        return bookDao.findById(id);
    }

    @Override
    public Collection<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public void attachAuthorToBook(Author author, Book book) {

    }

    @Override
    public Collection<Book> findAllByAuthor(Author author) {
        return null;
    }
}
