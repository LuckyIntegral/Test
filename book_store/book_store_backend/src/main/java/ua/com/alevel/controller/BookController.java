package ua.com.alevel.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.alevel.dto.BookDTO;
import ua.com.alevel.dto.BookDetailsDTO;
import ua.com.alevel.facade.BookFacade;

import java.util.Collection;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {
    private final BookFacade bookFacade;

    @GetMapping
    public ResponseEntity<Collection<BookDTO>> findAll() {
        return ResponseEntity.ok(bookFacade.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDetailsDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(bookFacade.findById(id));
    }
}
