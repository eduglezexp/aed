package com.tiendaonline.service.interfaces;

import java.util.Optional;

import com.tiendaonline.model.ClienteDetalles;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IClienteDetallesService {
    /**
     * Metodo que encuentra los detalles del cliente dado el id de un cliente
     * @param clienteId a encontrar detalles
     * @return un optional con los detalles del cliente
     */
    public Optional<ClienteDetalles> findByClienteId(int clienteId);

    /**
     * Metodo para guardar los detalles de un cliente
     * @param clienteId id del cliente a guardar detalles
     * @param detalles a guardar
     * @return los detalles del cliente
     */
    public ClienteDetalles saveDetallesForCliente(int clienteId, ClienteDetalles detalles);
}
