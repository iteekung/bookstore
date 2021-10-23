package io.spring.bookstore.api;

import io.spring.bookstore.domain.Book;
import io.spring.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api") @RequiredArgsConstructor
public class BookResource {
    private final BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<Map<String, List<Book>>> getBooks() {
        HashMap<String, Object> map = new HashMap<>();
        return ResponseEntity.ok().body(Collections.singletonMap("books", bookService.getBooks()));
    }
}
