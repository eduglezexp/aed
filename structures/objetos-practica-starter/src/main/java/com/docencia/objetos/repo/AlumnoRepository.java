package com.docencia.objetos.repo;

import com.docencia.objetos.domain.Alumno;
import java.util.List;
import java.util.Optional;

/**
 * @author eduglezexp
 * @version 1.0
 */

public interface AlumnoRepository {

  /**
   * Metodo para encontrar todos los alumnos
   * @return una lista de alumnos
   */
  List<Alumno> findAll();

  /**
   * Metodo para encontrar un alumno por id
   * @param id del alumno
   * @return el alumno encontrado por ese id
   */
  Optional<Alumno> findById(Long id);

  /**
   * Metodo para guardar un alumno
   * @param alumno a guardar
   * @return alumno guardado
   */
  Alumno save(Alumno alumno);

  /**
   * Metodo para comprobar si existe un alumno por su email
   * @param email del alumno
   * @return true si existe, false en caso contrario
   */
  boolean existsByEmail(String email);

  /**
   * Metodo para eliminar por id
   * @param id del alumno a eliminar
   * @return true/false
   */
  boolean deleteById(Long id);

  /**
   * Metodo que devuelve el numero de entities
   * @return el numero de entities
   */
  long count();
}
