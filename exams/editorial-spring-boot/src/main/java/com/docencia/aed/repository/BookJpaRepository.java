package com.docencia.aed.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docencia.aed.entity.Book;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {

    /**
     * Metodo para encontrar los libros de un author por su id
     * @param authorId del author
     * @return lista de libros
     */
    List<Book> findByAuthorId(int authorId);
}
