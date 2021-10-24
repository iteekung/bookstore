package io.spring.bookstore.service;

import io.spring.bookstore.domain.Book;
import io.spring.bookstore.domain.User;
import io.spring.bookstore.repo.BookRepo;
import io.spring.bookstore.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;
    private final BookRepo bookRepo;
    @Override
    public User getUser(Long Id) {
        return userRepo.getById(Id);
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public Boolean removeUser(String id) {
        Long bookId = Long.parseLong((id));
        userRepo.deleteById(bookId);
        return true;
    }

    @Override
    public List<Book> getBooksByUser(String userId) {
        return null;
    }

    @Override
    public Boolean saveOrder(Long userId, Long bookId) {
        if (userRepo.existsById(userId) && bookRepo.existsById(bookId)) {
            userRepo.getById(userId).getBooks().add(bookRepo.getById(bookId));
            return true;
        } else {
            return false;
        }
    }
}
