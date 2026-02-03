package com.docencia.aed.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.docencia.aed.entity.Author;
import com.docencia.aed.entity.Book;
import com.docencia.aed.repository.AuthorJpaRepository;
import com.docencia.aed.repository.BookJpaRepository;
import com.docencia.aed.service.IAuthorService;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Service
public class AuthorService implements IAuthorService {

    private final AuthorJpaRepository authorRepository;
    private final BookJpaRepository bookRepositoy;

    public AuthorService(AuthorJpaRepository authorRepository, BookJpaRepository bookRepositoy) {
        this.authorRepository = authorRepository;
        this.bookRepositoy = bookRepositoy;
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(int id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    public Author create(Author author) {
        if (author == null) {
            return null;
        }
        return authorRepository.save(author);
    }

    @Override
    public List<Book> findBooksByAuthor(int authorId) {
        return bookRepositoy.findByAuthorId(authorId);
    }

    @Override
    public Author update(Author author) {
        if (author == null) {
            return null;
        }
        return authorRepository.save(author);
    }

    @Override
    public boolean deleteById(int id) {
        if (!authorRepository.existsById(id)) {
            return false;
        }
        authorRepository.deleteById(id);
        return true;
    }
}
