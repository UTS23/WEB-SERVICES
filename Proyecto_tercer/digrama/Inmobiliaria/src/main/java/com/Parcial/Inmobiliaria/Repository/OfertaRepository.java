package com.Parcial.Inmobiliaria.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Entity.Oferta;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, Long> {
    
}