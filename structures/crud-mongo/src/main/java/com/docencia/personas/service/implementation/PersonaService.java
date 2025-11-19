package com.docencia.personas.service.implementation;

import org.springframework.stereotype.Service;

import com.docencia.personas.model.Persona;
import com.docencia.personas.repository.PersonaRepository;
import com.docencia.personas.service.IPersonaService;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findById(String id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public boolean deleteById(String id) {
        if (!personaRepository.existsById(id)) {
            return false;
        }
        personaRepository.deleteById(id);
        return true;
    }
}