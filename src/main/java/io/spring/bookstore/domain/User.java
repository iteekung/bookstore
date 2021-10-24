package io.spring.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private java.util.Date date_of_birth;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "order_book",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName =  "id")
    )
    private List<Book> books = new ArrayList<>();

    public User(String name, String surname, String username, String password, Date date_of_birth) {
        this.name = name;
        this.surname = surname;
        this.username =  username;
        this.password = password;
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "User {" + "id=" + id + ", name=" + name + ", surname=" + surname + ", date_of_birth=" + date_of_birth + "}";
    }
}
