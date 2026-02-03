package com.tiendaonline.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Document(collection = "cliente_detalles")
public class ClienteDetalles {

    @Id
    private String id;

    private int clienteId;

    private String telefono;

    private String notasInternas;
    
    /**
     * Constructor por defecto
     */
    public ClienteDetalles() {
    }

    /**
     * Constructor con todas las propiedades
     * @param id del cliente detalle
     * @param clienteId del cliente detalle
     * @param telefono del cliente detalle
     * @param notasInternas del cliente detalle
     */
    public ClienteDetalles(String id, int clienteId, String telefono, String notasInternas) {
        this.id = id;
        this.clienteId = clienteId;
        this.telefono = telefono;
        this.notasInternas = notasInternas;
    }

    /**
     * Getters and Setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNotasInternas() {
        return notasInternas;
    }

    public void setNotasInternas(String notasInternas) {
        this.notasInternas = notasInternas;
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
        ClienteDetalles other = (ClienteDetalles) obj;
        return Objects.equals(id, other.id);
    }
}
