package com.Parcial.Inmobiliaria.Service;

import java.util.Optional;

import com.Parcial.Inmobiliaria.Entity.Caracteristicas;

public interface CaracteristicasService {
    Caracteristicas saveCaracteristicas(Caracteristicas caracteristicas);
    
    Optional<Caracteristicas> getCaracteristicasById(Long id);
   
}
