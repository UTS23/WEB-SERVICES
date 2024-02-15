package com.Parcial.Inmobiliaria.Service;


import java.util.List;

import com.Parcial.Inmobiliaria.Entity.Visita;

public interface VisitaService {
    Visita saveVisita(Visita visita);

    List<Visita> getVisitasByInmueble(Long inmuebleId);
    
}
