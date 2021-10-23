package io.spring.bookstore.repo;

import io.spring.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
    Book findByName(String name);

}
