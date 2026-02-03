package com.tiendaonline.service;

import com.tiendaonline.model.ClienteDetalles;
import com.tiendaonline.repository.ClienteDetallesRepository;
import com.tiendaonline.service.interfaces.IClienteDetallesService;

import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Service
public class ClienteDetallesService implements IClienteDetallesService {

    private final ClienteDetallesRepository clienteDetallesRepository;

    public ClienteDetallesService(ClienteDetallesRepository clienteDetallesRepository) {
        this.clienteDetallesRepository = clienteDetallesRepository;
    }

    @Override
    public Optional<ClienteDetalles> findByClienteId(int clienteId) {
        return clienteDetallesRepository.findByClienteId(clienteId);
    }

    public ClienteDetalles saveDetallesForCliente(int clienteId, ClienteDetalles detalles) {
        if (detalles == null) {
            throw new IllegalArgumentException("Los detalles no pueden ser null");
        }
        detalles.setClienteId(clienteId);
        return clienteDetallesRepository.save(detalles);
    }
}
