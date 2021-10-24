package io.spring.bookstore.service;

import io.spring.bookstore.domain.Book;
import io.spring.bookstore.domain.User;

import java.util.List;

public interface UserService {
    User getUser(Long Id);
    User saveUser(User user);
    Boolean removeUser(String id);

    List<Book>getBooksByUser(String userId);
    Boolean saveOrder(Long userId, Long bookId);
}
