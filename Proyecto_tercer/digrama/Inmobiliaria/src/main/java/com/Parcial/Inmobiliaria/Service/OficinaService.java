package com.Parcial.Inmobiliaria.Service;

import java.util.Optional;

import com.Parcial.Inmobiliaria.Entity.Oficina;

public interface OficinaService {
    Oficina saveOficina(Oficina oficina);

    Optional<Oficina> getOficinaById(Long id);
    
}