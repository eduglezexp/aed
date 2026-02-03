package com.docencia.aed.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docencia.aed.entity.Book;
import com.docencia.aed.service.IBookService;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@RestController
@RequestMapping(name = "/api")
public class BookController {

    private final IBookService bookService;

    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> geBookById(int id) {
        Book book = bookService.findById(id);
        if (book == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(book);
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(Book book) {
        if (book == null) {
            return ResponseEntity.badRequest().build();
        }
        bookService.create(book);
        return ResponseEntity.ok(book);
    }
}
