package io.spring.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private Double price;
    private Boolean is_recommended;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "books")
    private List<User> users = new ArrayList<>();

    public Book(String name, String author, Double price, Boolean is_recommended) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.is_recommended = is_recommended;
    }

}
