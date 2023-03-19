package ua.com.level.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.com.level.persistance.entity.Author;
import ua.com.level.service.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "author/author_all";
    }

    @GetMapping("/new")
    public String redirectToNewBook(Model model) {
        model.addAttribute("author", new Author());
        return "author/author_new";
    }

    @PostMapping("/new")
    public String newBook(@ModelAttribute Author author) {
        authorService.create(author);
        return "redirect:/authors";
    }
}
