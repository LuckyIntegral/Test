package ua.com.alevel.api;

import ua.com.alevel.model.BookDetailsModel;
import ua.com.alevel.model.BookModel;

import java.util.Collection;
import java.util.Optional;

public interface BookApiService {
    Collection<BookModel> findAll();
    Optional<BookDetailsModel> findBookById(Long id);
}
