package com.example.booktestapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class BookController {

    @GetMapping("book")
    public ResponseEntity<Book> getBook() {
        return ResponseEntity.ok(Book.createBooks(1).get(0));
    }

    @GetMapping("books")
    public ResponseEntity<List<Book>> getBooks(@RequestParam int count) {
        return ResponseEntity.ok(Book.createBooks(count));
    }
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Book{
    public String name;
    public String isbn;

    public static List<Book> createBooks(int count) {
        Book book = new Book();
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            book.setName("Book" + i);
            book.setIsbn(i + "000");
            books.add(book);
        }
        return books;
    }
}
