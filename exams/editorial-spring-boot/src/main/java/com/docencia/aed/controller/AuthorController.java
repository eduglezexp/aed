package com.docencia.aed.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docencia.aed.entity.Author;
import com.docencia.aed.entity.Book;
import com.docencia.aed.service.IAuthorService;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@RestController
@RequestMapping(name = "/api")
public class AuthorController {

    private final IAuthorService authorService;

    public AuthorController(IAuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return authorService.findAll();
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Author> geAuthorById(int id) {
        Author author = authorService.findById(id);
        if (author == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(author);
    }

    @PostMapping("/authors")
    public ResponseEntity<Author> createAuthor(Author author) {
        if (author == null) {
            return ResponseEntity.badRequest().build();
        }
        authorService.create(author);
        return ResponseEntity.ok(author);
    }

    @PutMapping("/authors")
    public ResponseEntity<Author> saveAuthor(Author author) {
        if (author == null) {
            return ResponseEntity.notFound().build();
        }
        authorService.update(author);
        return ResponseEntity.ok(author);
    }

    @DeleteMapping("/authors")
    public ResponseEntity<Author> deleteAuthor(int id) {
        Author author = authorService.findById(id);
        boolean isDeleted = authorService.deleteById(id);
        if (!isDeleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(author);
    }

    @GetMapping("/authors/{id}/books")
    public ResponseEntity<List<Book>> getBooksByAuthorId(int id) {
        List<Book> books = authorService.findBooksByAuthor(id);
        if (books.isEmpty() || books == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(books);
    }
}
