package ua.com.alevel.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.alevel.dto.AuthorDTO;
import ua.com.alevel.dto.AuthorDetailsDTO;
import ua.com.alevel.facade.AuthorFacade;

import java.util.Collection;

@RestController
@RequestMapping("/authors")
@AllArgsConstructor
public class AuthorController {
    private final AuthorFacade authorFacade;

    @GetMapping
    public ResponseEntity<Collection<AuthorDTO>> findAll() {
        return ResponseEntity.ok(authorFacade.findAll());
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody AuthorDTO dto) {
        authorFacade.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(true);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDetailsDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(authorFacade.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> update(@RequestBody AuthorDTO dto, @PathVariable Long id) {
        authorFacade.update(dto, id);
        return ResponseEntity.ok(true);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        authorFacade.delete(id);
        return ResponseEntity.ok(true);
    }
}
