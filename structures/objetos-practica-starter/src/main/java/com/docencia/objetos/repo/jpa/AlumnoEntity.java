package com.docencia.objetos.repo.jpa;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author eduglezexp
 * @version 1.0
 */

@Entity
@Table(name = "alumnos")
public class AlumnoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "nombre", nullable = false)
  private String nombre;

  @Column(name = "email", nullable = false, unique = true)
  private String email;

  @Column(name = "ciclo", nullable = false)
  private String ciclo;

  /**
   * Constructor por defecto
   */
  public AlumnoEntity() {
  }

  /**
   * Constructor con la propiedad identificativa id
   * @param id del alumno
   */
  public AlumnoEntity(Long id) {
    this.id = id;
  }

  /**
   * Constructor con todas las propiedades
   * @param id del alumno
   * @param nombre del alumno
   * @param email del alumno
   * @param ciclo del alumno
   */
  public AlumnoEntity(Long id, String nombre, String email, String ciclo) {
    this.id = id;
    this.nombre = nombre;
    this.email = email;
    this.ciclo = ciclo;
  }

  /**
   * Getters and Setters
   */
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCiclo() {
    return this.ciclo;
  }

  public void setCiclo(String ciclo) {
    this.ciclo = ciclo;
  }

  @Override
  public String toString() {
    return "AlumnoEntity [id=" + id + ", nombre=" + nombre + ", email=" + email + ", ciclo=" + ciclo + "]";
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AlumnoEntity)) {
            return false;
        }
        AlumnoEntity alumnoEntity = (AlumnoEntity) o;
        return Objects.equals(id, alumnoEntity.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
