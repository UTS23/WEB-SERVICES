package com.Parcial.Inmobiliaria.Service;

import java.util.Optional;

import com.Parcial.Inmobiliaria.Entity.Oferta;

public interface OfertaService {
    Oferta saveOferta(Oferta oferta);

    Optional<Oferta> getOfertaByInmueble(Long inmuebleId);
    
}
