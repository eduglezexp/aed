package com.docencia.aed.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "city")
    private String city;

    /**
     * Constructor por defecto
     */
    public Publisher() {
    }

    /**
     * Constructor con la propiedad id
     * @param id propiedad identificadora de la clase
     */
    public Publisher(int id) {
        this.id = id;
    }

    /**
     * Constructor con todas las propiedades
     * @param id del publisher
     * @param name del publisher
     * @param city del publisher
     */
    public Publisher(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Publisher [id=" + id + ", name=" + name + ", city=" + city + "]";
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
        Publisher other = (Publisher) obj;
        return id == other.id;
    }
}
