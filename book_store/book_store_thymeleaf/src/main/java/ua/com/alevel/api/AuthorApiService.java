package ua.com.alevel.api;

import ua.com.alevel.model.AuthorDetailsModel;
import ua.com.alevel.model.AuthorModel;

import java.util.Collection;
import java.util.Optional;

public interface AuthorApiService {
    Collection<AuthorModel> findAll();
    Optional<AuthorDetailsModel> findAuthorById(Long ig);
}
