package com.Parcial.Inmobiliaria.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Entity.Oficina;

@Repository
public interface OficinaRepository extends JpaRepository<Oficina, Long> {
   
}
