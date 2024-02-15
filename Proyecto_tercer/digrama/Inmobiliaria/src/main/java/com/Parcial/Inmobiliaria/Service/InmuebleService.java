package com.Parcial.Inmobiliaria.Service;

import java.util.List;
import java.util.Optional;

import com.Parcial.Inmobiliaria.Entity.Inmueble;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);

    Optional<Inmueble> getInmuebleById(Long id);

    List<Inmueble> getInmueblesDisponibles(String tipoOferta);
    
}