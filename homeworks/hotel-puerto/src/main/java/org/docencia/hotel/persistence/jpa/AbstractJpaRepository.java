package org.docencia.hotel.persistence.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public abstract class AbstractJpaRepository<T, ID> {

    @PersistenceContext
    protected EntityManager entityManager;

    protected final Class<T> entityClass;

    protected AbstractJpaRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public boolean existsById(ID id) {
        return entityManager.find(entityClass, id) != null;
    }

    public T findById(ID id) {
        return entityManager.find(entityClass, id);
    }

    public List<T> findAll() {
        String querry = "SELECT e FROM " + entityClass.getSimpleName() + " e";
        return entityManager.createQuery(querry, entityClass).getResultList();
    }

    @Transactional
    public T save(T entity) {
        return entityManager.merge(entity);
    }

    @Transactional
    public boolean deleteById(ID id) {
        if (!existsById(id)) {
            return false;
        }
        entityManager.remove(id);
        return true;
    }
}
