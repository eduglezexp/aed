package com.tiendaonline.repository;

import org.springframework.stereotype.Repository;

import com.tiendaonline.model.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    List<Cliente> findAllByOrderByNombreAsc();
}
