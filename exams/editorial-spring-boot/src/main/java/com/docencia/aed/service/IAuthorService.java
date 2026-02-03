package com.docencia.aed.service;

import java.util.List;

import com.docencia.aed.entity.Author;
import com.docencia.aed.entity.Book;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IAuthorService {

    /**
     * Metodo para encontrar todos los authores
     * @return lista de authores
     */
    List<Author> findAll();

    /**
     * Metodo para encontrar un author por su id
     * @param id del author
     * @return author encontrado
     */
    Author findById(int id);

    /**
     * Metodo para crear un author
     * @param author a crear
     * @return author
     */
    Author create(Author author);

    /**
     * Metodo para actualizar un author
     * @param author a actualizar
     * @return author actualizado
     */
    Author update(Author author);

    /**
     * Metodo para elimnar a un author dado su id
     * @param id del usuario a eliminar
     * @return true/false
     */
    boolean deleteById(int id);

    /**
     * Metodo para encontrar los libros por su author
     * @param authorId del author
     * @return libros del author
     */
    List<Book> findBooksByAuthor(int authorId);
}
