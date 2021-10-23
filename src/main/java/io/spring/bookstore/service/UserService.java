package io.spring.bookstore.service;

import io.spring.bookstore.domain.Book;
import io.spring.bookstore.domain.User;

import java.util.List;

public interface UserService {
    User getUser(String username);
    User saveUser(User user);
    Boolean removeUser(String id);
}
