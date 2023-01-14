package com.example.booktestapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
@Slf4j
public class BookController {

    @GetMapping("book")
    public ResponseEntity<Book> getBook() {
        return ResponseEntity.ok(Book.createBooks(1).get(0));
    }

    @GetMapping("books")
    public ResponseEntity<List<Book>> getBooks(@RequestParam int count) {
        return ResponseEntity.ok(Book.createBooks(count));
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    static class Book{
        private String name;
        private String isbn;

        public static List<Book> createBooks(int count) {
            List<Book> books = new ArrayList<>();
            for (int i = 1; i <= count; i++) {
                books.add(new Book(Book.class.getSimpleName() + i, i + "000"));
            }
            return books;
        }
    }

}


