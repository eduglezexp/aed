package com.docencia.personas.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.docencia.personas.model.Rol;
import com.docencia.personas.service.interfaces.IRolService;

@SpringBootTest
public class RolServiceTest {

    static final String ROL_1 = "ROL-1";
    static final String NOMBRE_1 = "NOMBRE-1";
    IRolService rolService;
    Rol rol;

    @Autowired
    public void setRolService(IRolService rolService) {
        this.rolService = rolService;
    }

    @BeforeEach
    void beforeEach() {
        if (rol == null) {
            rol = new Rol(ROL_1, NOMBRE_1);
        }
        rolService.save(rol);
    }

    @Test
    void findByTest() {
        Rol rolFind = new Rol(ROL_1);
        rolFind = rolService.findBy(rolFind);
        Assertions.assertNotNull(rolFind.getId());
        Assertions.assertEquals(rol, rolFind);
        Assertions.assertEquals(ROL_1, rolFind.getId());
        Assertions.assertEquals(NOMBRE_1, rolFind.getNombre());
    }

    @AfterEach
    void afterEach() {
        Rol rolDelete = new Rol(ROL_1);
        rolService.delete(rolDelete);
        rolDelete = rolService.findBy(rolDelete);
        Assertions.assertNull(rolDelete);
    }
}
