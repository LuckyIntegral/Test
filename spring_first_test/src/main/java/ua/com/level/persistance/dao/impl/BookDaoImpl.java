package ua.com.level.persistance.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.com.level.persistance.dao.BookDao;
import ua.com.level.persistance.entity.Author;
import ua.com.level.persistance.entity.Book;

import java.util.Collection;

@Service
@Transactional
public class BookDaoImpl implements BookDao {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public void create(Book entity) {
        manager.persist(entity);
    }

    @Override
    public void update(Book entity) {
        manager.merge(entity);
    }

    @Override
    public void delete(Long id) {
        manager.createQuery("delete from Book b where b.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public Book findById(Long id) {
        return manager.find(Book.class, id);
    }

    @Override
    public Collection<Book> findAll() {
        return manager.createQuery("from Book").getResultList();
    }

    @Override
    public Collection<Book> findAllByAuthor(Author author) {
        return manager.createQuery("from Book b join b.authors a where a.id = :authorId")
                .setParameter("auhtorId", author.getId())
                .getResultList();
    }
}
