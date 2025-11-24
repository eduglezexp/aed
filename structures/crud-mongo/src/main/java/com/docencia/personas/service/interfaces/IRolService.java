package com.docencia.personas.service.interfaces;

import com.docencia.personas.model.Rol;

public interface IRolService {
    Rol save(Rol rol);
    Rol findBy(Rol rol);
    boolean delete(Rol rol);
}
