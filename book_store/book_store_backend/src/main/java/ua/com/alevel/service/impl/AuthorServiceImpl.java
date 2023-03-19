package ua.com.alevel.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.alevel.persistance.repository.AuthorRepository;
import ua.com.alevel.service.AuthorService;
import ua.com.alevel.persistance.entity.Author;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public void create(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void update(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void delete(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public Collection<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Collection<Author> findAllByBook(Long id) {
        return authorRepository.findAllByBook(id);
    }
}
