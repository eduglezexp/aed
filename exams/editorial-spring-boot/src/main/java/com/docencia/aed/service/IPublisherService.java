package com.docencia.aed.service;

import java.util.List;

import com.docencia.aed.entity.Publisher;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IPublisherService {

    /**
     * Metodo para encontrar todos los publishers
     * @return lista de publishers
     */
    List<Publisher> findAll();

    /**
     * Metodo para encontrar un publisher por su id
     * @param id del publisher
     * @return publisher encontrado
     */
    Publisher findById(int id);

    /**
     * Metodo para encontrar un publisher
     * @param publisher a crear
     * @return publisher creado
     */
    Publisher create(Publisher publisher);
}
