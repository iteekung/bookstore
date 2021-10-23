package io.spring.bookstore.service;

import io.spring.bookstore.domain.User;
import io.spring.bookstore.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;
    @Override
    public User getUser(String username) {
        return userRepo.findByUsername(username);
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
}
