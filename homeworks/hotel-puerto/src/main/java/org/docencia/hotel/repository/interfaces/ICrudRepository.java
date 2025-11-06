package org.docencia.hotel.repository.interfaces;

import java.util.List;


/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface ICrudRepository<T> {
    boolean existsById(String id);
    T findById(String id);
    List<T> findAll();
    T save(T entity);
    boolean deleteById(String id);
}
