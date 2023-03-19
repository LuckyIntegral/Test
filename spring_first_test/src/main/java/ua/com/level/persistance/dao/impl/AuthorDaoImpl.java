package ua.com.level.persistance.dao.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.level.persistance.dao.AuthorDao;
import ua.com.level.persistance.entity.Author;
import ua.com.level.persistance.entity.Book;

import java.util.Collection;

@Service
@Transactional
public class AuthorDaoImpl implements AuthorDao {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public Collection<Book> findAllByBook(Long id) {
        return manager.createQuery("from Author a left join a.books b where b.id = :id")
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public void create(Author entity) {
        manager.persist(entity);
    }

    @Override
    public void update(Author entity) {
        manager.merge(entity);
    }

    @Override
    public void delete(Long id) {
        manager.createQuery("delete from Author a where a.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

    @Override
    public Author findById(Long id) {
        return manager.find(Author.class, id);
    }

    @Override
    public Collection<Author> findAll() {
        return manager.createQuery("from Author ").getResultList();
    }
}
