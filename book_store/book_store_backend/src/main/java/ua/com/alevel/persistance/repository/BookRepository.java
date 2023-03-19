package ua.com.alevel.persistance.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ua.com.alevel.persistance.entity.Book;

import java.util.Collection;

@Repository
public interface BookRepository extends BaseRepository<Book> {
    @Query("from Book b join b.authors a where a.id =: authorId")
    Collection<Book> findAllByAuthors(@Param("authorId") Long id);
}
