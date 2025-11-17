package com.docencia.objetos.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.docencia.objetos.domain.Alumno;
import com.docencia.objetos.repo.jpa.AlumnoEntity;

/**
 * @author eduglezexp
 * @version 1.0
 */

public class AlumnoMapperUtils {

    /**
     * Funcion que transforma un objeto de tipo 
     * AlumnoEntity a Alumno
     * @param alumnoEntity a transformar
     * @return alumno transformado
     */
    public static Alumno to(AlumnoEntity alumnoEntity) {
        if (alumnoEntity == null) {
            return null;
        }
        Alumno alumno = new Alumno(
            alumnoEntity.getId(), 
            alumnoEntity.getNombre(), 
            alumnoEntity.getEmail(), 
            alumnoEntity.getCiclo()
        );
        return alumno;
    }

    public static AlumnoEntity to(Alumno alumno) {
        if (alumno == null) {
            return null;
        }
        AlumnoEntity alumnoEntity = new AlumnoEntity(
            alumno.getId(), 
            alumno.getNombre(), 
            alumno.getEmail(), 
            alumno.getCiclo()
        );
        return alumnoEntity;
    }

    /**
     * Funcion que transforma una lista de objetos tipo AlumnoEntity 
     * a una lista de Alumno
     * @param alumnoEntities a transformar
     * @return una lista de alumnos transformados
     */
    public static List<Alumno> to(List<AlumnoEntity> alumnoEntities) {
        List<Alumno> alumnos = new ArrayList<>(); 
        if (alumnoEntities == null || alumnoEntities.isEmpty()) {
            return alumnos;
        }
        for (AlumnoEntity alumnoEntity : alumnoEntities) {
            alumnos.add(to(alumnoEntity));
        }
        return alumnos;
    }

    public static Optional<Alumno> to(Optional<AlumnoEntity> alumnoEntities) {
        Optional<Alumno> alumnos = Optional.empty(); 
        if (alumnoEntities == null || alumnoEntities.isEmpty()) {
            return alumnos;
        }
        return alumnos.map(alumno -> to(alumnoEntities)).orElse(null);
    }
}
