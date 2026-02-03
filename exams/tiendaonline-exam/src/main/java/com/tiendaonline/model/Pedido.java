package com.tiendaonline.model;

import java.util.Objects;

import jakarta.persistence.*;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    /**
     * Constructor por defecto
     */
    public Pedido() {
    }

    /**
     * Constructor con la propiedad id
     * @param id del pedido
     */
    public Pedido(int id) {
        this.id = id;
    }

    /**
     * Constructor con todas las propiedades menos el id
     * @param estado del pedido
     * @param cliente del pedido
     */
    public Pedido(String estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
    }

    /**
     * Getters and Setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pedido other = (Pedido) obj;
        return id == other.id;
    }
}
