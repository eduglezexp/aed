package com.tiendaonline.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tiendaonline.model.ClienteDetalles;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface ClienteDetallesRepository extends MongoRepository<ClienteDetalles, String> {
    Optional<ClienteDetalles> findByClienteId(int clienteId);
    //ClienteDetalles saveDetallesForCliente(int clienteId, ClienteDetalles detalles);
}
