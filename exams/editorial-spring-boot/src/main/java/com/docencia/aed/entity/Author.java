package com.docencia.aed.entity;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "country")
    private String country;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    /**
     * Constructor por defecto
     */
    public Author() {
    }

    /**
     * Constructor con la propiedad id
     * @param id propiedad identificadora de la clase
     */
    public Author(int id) {
        this.id = id;
    }

    /**
     * Constructor con todas las propiedades
     * @param id del author
     * @param name del author
     * @param country del author
     */
    public Author(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", name=" + name + ", country=" + country + "]";
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
        Author other = (Author) obj;
        return id == other.id;
    }
}
