package com.docencia.aed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docencia.aed.entity.Publisher;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface PublisherJpaRepository extends JpaRepository<Publisher, Integer> {

}
