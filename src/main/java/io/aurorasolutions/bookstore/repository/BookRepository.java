package io.aurorasolutions.bookstore.repository;

import io.aurorasolutions.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Book entity.
 */
public interface BookRepository extends JpaRepository<Book,Long>{

}
