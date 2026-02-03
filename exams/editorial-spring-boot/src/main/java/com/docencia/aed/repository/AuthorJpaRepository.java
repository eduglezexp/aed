package com.docencia.aed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docencia.aed.entity.Author;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface AuthorJpaRepository extends JpaRepository<Author, Integer> {

}
