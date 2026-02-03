package com.docencia.aed.service;

import java.util.List;

import com.docencia.aed.entity.Book;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IBookService {

    /**
     * Metodo para encontrar todos los libros
     * @return lista de libros
     */
    List<Book> findAll();

    /**
     * Metodo para encontrar un libro por su id
     * @param id del libro a buscar
     * @return libro encontrado
     */
    Book findById(int id);

    /**
     * Metodo para crear un libro
     * @param book a crear
     * @return libro creado
     */
    Book create(Book book);
}
