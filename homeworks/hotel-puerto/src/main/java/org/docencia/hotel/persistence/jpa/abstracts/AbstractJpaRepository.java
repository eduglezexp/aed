package org.docencia.hotel.persistence.jpa.abstracts;

import jakarta.transaction.Transactional;
import java.util.List;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public abstract class AbstractJpaRepository<T, ID> {

    private final Class<T> repository;

    public AbstractJpaRepository(Class<T> repository) {
        this.repository = repository;
    }

    public boolean existsById(ID id) {
        return false;
    }

    public T findById(ID id) {
        return null;
    }

    public List<T> findAll() {
        return null;
    }

    @Transactional
    public T save(T entity) {
        return null;
    }

    @Transactional
    public boolean deleteById(ID id) {
        if (!existsById(id)) {
            return false;
        }
        
        return true;
    }
}
