package com.docencia.objetos.repo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author eduglezexp
 * @version 1.0
 */

public interface AlumnoJpaRepository extends JpaRepository<AlumnoEntity, Long> {

  /**
   * Método para comprobar si existe un alumno por su email
   * @param email del alumno
   * @return true si existe, false en caso contrario
   */
  boolean existsByEmail(String email);
}
