package com.docencia.personas.service;

import java.util.List;

import com.docencia.personas.model.Persona;

public interface IPersonaService {
    List<Persona> findAll();
    Persona findById(String id);
    Persona save(Persona persona);
    boolean deleteById(String id);
}
