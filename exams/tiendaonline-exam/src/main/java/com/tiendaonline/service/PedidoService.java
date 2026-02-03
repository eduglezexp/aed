package com.tiendaonline.service;

import com.tiendaonline.model.Cliente;
import com.tiendaonline.model.Pedido;
import com.tiendaonline.repository.ClienteRepository;
import com.tiendaonline.repository.PedidoRepository;
import com.tiendaonline.service.interfaces.IPedidoService;

import org.springframework.stereotype.Service;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Service
public class PedidoService implements IPedidoService{

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;

    public PedidoService(PedidoRepository pedidoRepository, ClienteRepository clienteRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Pedido crearPedido(Integer clienteId, String estado) {
        if (clienteId == null || estado == null) {
            throw new IllegalArgumentException("clienteId y estado son obligatorios");
        }

        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new IllegalArgumentException("Cliente no existe"));

        Pedido pedido = new Pedido();
        pedido.setEstado(estado);
        pedido.setCliente(cliente);

        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido findById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El id no puede ser null");
        }
        return pedidoRepository.findById(id).orElse(null);
    }
}
