package com.Parcial.Inmobiliaria.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Entity.Visita;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Long> {
   
}
