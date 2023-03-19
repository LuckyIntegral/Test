package ua.com.alevel.api.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ua.com.alevel.api.BookApiService;
import ua.com.alevel.model.BookDetailsModel;
import ua.com.alevel.model.BookModel;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BookApiServiceImpl implements BookApiService {
    @Value("${bookstore.backend.api.url}")
    private String apiUrl;
    @Override
    public Collection<BookModel> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<BookModel[]> bookModelResponseEntity = restTemplate.exchange(
                apiUrl + "/books",
                HttpMethod.GET,
                null,
                BookModel[].class
        );

        if (bookModelResponseEntity.getStatusCode().is2xxSuccessful()) {
            BookModel[] bookModels = bookModelResponseEntity.getBody();
            if (bookModels != null) {
                return List.of(bookModels);
            }
        }
        return Collections.emptyList();
    }

    @Override
    public Optional<BookDetailsModel> findBookById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<BookDetailsModel> responseEntity = restTemplate.exchange(
                apiUrl + "/books/" + id,
                HttpMethod.GET,
                null,
                BookDetailsModel.class
        );

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            BookDetailsModel bookDetailsModel = responseEntity.getBody();
            if (bookDetailsModel != null) {
                return Optional.of(bookDetailsModel);
            }
        }

        return Optional.empty();
    }
}
