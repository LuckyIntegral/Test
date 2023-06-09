package ua.com.alevel.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.alevel.api.AuthorApiService;
import ua.com.alevel.model.AuthorDetailsModel;

import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/authors")
public class AuthorController {
    private AuthorApiService authorApiService;

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("authors", authorApiService.findAll());
        return "pages/open/plp/authors";
    }

    @GetMapping("/{id}")
    public String findAuthorById(@PathVariable Long id, Model model) {
        Optional<AuthorDetailsModel> authorDetailsModel = authorApiService.findAuthorById(id);
        if (authorDetailsModel.isPresent()) {
            model.addAttribute("author", authorDetailsModel.get());
            return "pages/open/pdp/author_details";
        }
        return "pages/open/404";
    }
}
