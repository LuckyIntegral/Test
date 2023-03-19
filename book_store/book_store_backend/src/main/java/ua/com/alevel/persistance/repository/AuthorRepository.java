package ua.com.alevel.persistance.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ua.com.alevel.persistance.entity.Author;

import java.util.Collection;

@Repository
public interface AuthorRepository extends BaseRepository<Author> {
    Collection<Author> findAllByBooksId(Long id);

    @Query(value = "from Author as a join a.books b where b.id =: bookId")
    Collection<Author> findAllByBook(@Param("bookId") Long id);

//    @Query(value = "select * from authors as a left join book_author ba on a.id = ba.author_id where ba.book_id = ?1 ", nativeQuery = true)
//    Collection<Author> findAllByBook(@Param("bookId") Long id);
}
