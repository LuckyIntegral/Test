package ua.com.level.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ua.com.level.persistance.entity.Book;
import ua.com.level.service.AuthorService;
import ua.com.level.service.BookService;

import java.util.Collection;
import java.util.Date;

@Controller
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    private final AuthorService authorService;

    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "book/book_all";
    }

    @GetMapping("/rest")
    @ResponseBody
    public ResponseEntity<Collection<BookDto>> findAll() {
        return ResponseEntity.ok(bookService.findAll().stream().map(BookDto::new).toList());
    }

    @GetMapping("/new")
    public String redirectToNewBook(Model model) {
        model.addAttribute("book", new Book());
        return "book/book_new";
    }

    @PostMapping("/new")
    public String newBook(@ModelAttribute Book book) {
        bookService.create(book);
        return "redirect:/books";
    }

    @GetMapping("/{id}/authors")
    public String findAuthors(@PathVariable Long id, Model model) {
        model.addAttribute("authors", authorService.findAllByBook(id));
        return "author/author_all";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "book/book_new";
    }

    @Getter
    @Setter
    private class BookDto {
        private Long id;
        private Date created;
        private Date updated;
        private String bookName;
        private String description;
        private String imageUrl;
        private Integer pageSize;
        private Integer publishDate;

        public BookDto(Book book ) {
            this.id = book.getId();
            this.created = book.getCreated();
            this.updated = book.getUpdated();
            this.bookName = book.getBookName();
            this.description = book .getDescriptions();
            this.imageUrl = book .getImageUrl();
            this.pageSize = book.getPageSize();
            this.publishDate = book.getPublishDate();
        }
    }
}
