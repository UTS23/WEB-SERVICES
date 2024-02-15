package com.Parcial.Inmobiliaria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Entity.Inmueble;

@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
    
}