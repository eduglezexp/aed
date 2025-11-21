package com.docencia.personas.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.docencia.personas.model.Direccion;
import com.docencia.personas.model.Persona;

@SpringBootTest
@ActiveProfiles
public class PersonaRepositoryTest {

    private static final String NOMBRE = "test";
    private static final int EDAD = 18;
    private static final String EMAIL = "un@email.com";

    private static final String CALLE = "Una calle";
    private static final String CIUDAD = "Una ciudad";
    private static final String CODIGO_POSTAL = "38200";
    private static final String PAIS = "Canarias";

    private PersonaRepository personaRepository;
    private Persona personaCollection;
    private Persona personaFind;
    private Direccion direccion;


    @Autowired
    public void setPersonaRepository(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    
    @BeforeEach
    void cleanDataBase() {
        personaRepository.deleteAll();
        direccion = new Direccion(
            CALLE, 
            CIUDAD, 
            CODIGO_POSTAL, 
            PAIS
        );
        personaCollection = new Persona(
            NOMBRE, 
            EDAD, 
            EMAIL, 
            direccion
        );
        personaFind = personaRepository.save(personaCollection);
    }

    @Test
    void findTest() {
        Assertions.assertEquals(1, personaRepository.count());
        Assertions.assertNotNull(personaFind);
        Assertions.assertNotNull(personaFind.getId());
    }

    @Test 
    void findByEmailTest() {
        Optional<Persona> personaOptional = personaRepository.findByEmail(EMAIL);
        Assertions.assertEquals(EMAIL, personaOptional.get().getEmail());
    }

    @Test
    void findByCiudadTest() {
        List<Persona> personas = personaRepository.findByCiudad(CIUDAD);
        Assertions.assertEquals(1, personas.size());
        Assertions.assertEquals(CIUDAD, personas.get(0).getDireccion().getCiudad());
    }

    @Test
    void findByNombreContainingIgnoreCaseTest() {
        List<Persona> personas = personaRepository.findByNombreContainingIgnoreCase(NOMBRE);
        Assertions.assertEquals(1, personas.size());
        Assertions.assertEquals(NOMBRE, personas.get(0).getNombre());
    }

    @Test
    void findByEdadBetweenTest() {
        int min = 16;
        int max = 22;
        List<Persona> personas = personaRepository.findByEdadBetween(min, max);
        Assertions.assertEquals(1, personas.size());
        Assertions.assertTrue(personas.get(0).getEdad() >= min && personas.get(0).getEdad() <= max);
    }
}
