package com.docencia.aed.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.docencia.aed.entity.Book;
import com.docencia.aed.repository.BookJpaRepository;
import com.docencia.aed.service.IBookService;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Service
public class BookService implements IBookService {

    private final BookJpaRepository repository;

    public BookService(BookJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Book create(Book book) {
        if (book == null) {
            return null;
        }
        return repository.save(book);
    }
}
