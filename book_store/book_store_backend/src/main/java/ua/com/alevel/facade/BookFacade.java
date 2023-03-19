package ua.com.alevel.facade;

import ua.com.alevel.dto.BookDTO;
import ua.com.alevel.dto.BookDetailsDTO;

import java.util.Collection;

public interface BookFacade {
    Collection<BookDTO> findAll();
    BookDetailsDTO findById(Long id);
}
