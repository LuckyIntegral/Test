package ua.com.alevel.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.alevel.api.BookApiService;
import ua.com.alevel.model.BookDetailsModel;

import java.util.Optional;

@Controller
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {
    private final BookApiService bookApiService;

    @GetMapping()
    public String findAll(Model model) {
        model.addAttribute("books", bookApiService.findAll());
        return "404";
    }

    @GetMapping("/{id}")
    public String findBookById(@PathVariable Long id, Model model) {
        Optional<BookDetailsModel> modelOptional = bookApiService.findBookById(id);
        if (modelOptional.isPresent()) {
            model.addAttribute("book", modelOptional.get());
            return "pages/open/pdp/book_details";
        } else {
            return "pages/open/404";
        }
    }
}
