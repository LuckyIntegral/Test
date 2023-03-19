package ua.com.alevel.facade;

import ua.com.alevel.dto.AuthorDTO;
import ua.com.alevel.dto.AuthorDetailsDTO;

import java.util.Collection;

public interface AuthorFacade {
    Collection<AuthorDTO> findAll();
    void create(AuthorDTO authorDTO);
    void update(AuthorDTO authorDTO, Long id);
    void delete(Long id);
    AuthorDetailsDTO findById(Long id);
}
