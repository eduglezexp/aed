package com.tiendaonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiendaonline.model.Pedido;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
