package org.docencia.hotel.repository.interfaces;

import java.util.List;


/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface ICrudRepository<T> {

    /**
     * Metodo para ver si existe la entity dada su id
     * @param id de la entity
     * @return true/false
     */
    boolean existsById(String id);

    /**
     * Metodo para encontrar una entity dada su id
     * @param id de la entity
     * @return true/false
     */
    T findById(String id);

    /**
     * Metodo para encontrar todas las entities
     * @return una lista de entities
     */
    List<T> findAll();

    /**
     * Metodo para guardar una entity
     * @param entity a guardar
     * @return entity a guardar
     */
    T save(T entity);

    /**
     * Metodo para eliminar una entity dada su id
     * @param id de la entity
     * @return true/false
     */
    boolean deleteById(String id);
}
