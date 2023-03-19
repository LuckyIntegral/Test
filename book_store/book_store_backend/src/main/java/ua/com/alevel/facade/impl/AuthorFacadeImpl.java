package ua.com.alevel.facade.impl;

import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import ua.com.alevel.dto.AuthorDTO;
import ua.com.alevel.dto.AuthorDetailsDTO;
import ua.com.alevel.facade.AuthorFacade;
import ua.com.alevel.persistance.entity.Author;
import ua.com.alevel.service.AuthorService;

import java.util.Collection;
import java.util.Collections;

@Service
@AllArgsConstructor
public class AuthorFacadeImpl implements AuthorFacade {
    private final AuthorService authorService;

    @Override
    public void create(AuthorDTO dto) {
        Author author = new Author();
        author.setFirstName(dto.getFirstName());
        author.setLastName(dto.getLastName());
        authorService.create(author);
    }

    @Override
    public void update(AuthorDTO dto, Long id) {
        Author author = authorService.findById(id);
        author.setFirstName(dto.getFirstName());
        author.setLastName(dto.getLastName());
        authorService.update(author);
    }

    @Override
    public void delete(Long id) {
        authorService.delete(id);
    }

    @Override
    public AuthorDetailsDTO findById(Long id) {
        return new AuthorDetailsDTO(authorService.findById(id));
    }

    @Override
    public Collection<AuthorDTO> findAll() {
        Collection<Author> authors = authorService.findAll();
        if (CollectionUtils.isNotEmpty(authors)) {
            return authors.stream().map(AuthorDTO::new).toList();
        }
        return Collections.emptyList();
    }
}
