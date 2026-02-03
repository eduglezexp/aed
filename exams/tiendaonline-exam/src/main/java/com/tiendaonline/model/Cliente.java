package com.tiendaonline.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    /**
     * Constructor por defecto
     */
    public Cliente() {
    }

    /**
     * Constructor con la propiedad id
     * @param id del cliente
     */
    public Cliente(int id) {
        this.id = id;
    }

    /**
     * Constructor con todas las propiedades menos el id
     * @param nombre del cliente
     * @param email del cliente
     * @param pedidos del cliente
     */
    public Cliente(String nombre, String email, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.email = email;
        this.pedidos = pedidos;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
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
        Cliente other = (Cliente) obj;
        return id == other.id;
    }
}
