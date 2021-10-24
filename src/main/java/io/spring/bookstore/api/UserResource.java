package io.spring.bookstore.api;

import io.spring.bookstore.domain.User;
import io.spring.bookstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api") @RequiredArgsConstructor
public class UserResource {
    private final UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<User>getUser(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(userService.getUser(id));
    }

    @PostMapping("/user")
    public ResponseEntity<User>saveUser(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.saveUser(user));
    }

    @DeleteMapping("/user")
    public ResponseEntity<Boolean>removeUser(@RequestBody String user) {
        return ResponseEntity.ok().body(userService.removeUser(user));
    }

}
