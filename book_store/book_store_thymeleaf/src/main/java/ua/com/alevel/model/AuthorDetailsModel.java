package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class AuthorDetailsModel extends AuthorModel {
    private Collection<BookModel> books;
}
