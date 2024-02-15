package com.Parcial.Inmobiliaria.Service;

import java.util.Optional;

import com.Parcial.Inmobiliaria.Entity.Propietario;

public interface PropietarioService {
    Propietario savePropietario(Propietario propietario);

    Optional<Propietario> getPropietarioById(Long id);
    
}
