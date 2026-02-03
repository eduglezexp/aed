package com.tiendaonline.service;

import com.tiendaonline.model.Cliente;
import com.tiendaonline.repository.ClienteRepository;
import com.tiendaonline.service.interfaces.IClienteService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Service
public class ClienteService implements IClienteService{

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> findAllSortedByNombre() {
        return clienteRepository.findAllByOrderByNombreAsc();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El id no puede ser null");
        }
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser null");
        }
        return clienteRepository.save(cliente);
    }

    @Override
    public boolean deleteById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El id no puede ser null");
        }

        if (!clienteRepository.existsById(id)) {
            return false;
        }

        clienteRepository.deleteById(id);
        return true;
    }
}
