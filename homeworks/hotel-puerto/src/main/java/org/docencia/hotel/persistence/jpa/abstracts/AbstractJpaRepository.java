package org.docencia.hotel.persistence.jpa.abstracts;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.UUID;

import org.docencia.hotel.persistence.interfaces.ICrudRepository;
import org.docencia.hotel.repository.interfaces.IJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public abstract class AbstractJpaRepository<T, ID> implements ICrudRepository<T, ID> {

    private IJpaRepository<T, ID> repository;
    
    @Autowired
    public void setRepository(IJpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }

    @Override
    public T findById(ID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public T save(T entity) {
        if (entity.getId() == null || entity.getId().isBlank()) {
            entity.setId(UUID.randomUUID().toString());
        }
        return repository.save(entity);
    }

    @Override
    @Transactional
    public boolean deleteById(ID id) {
        if (!existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
