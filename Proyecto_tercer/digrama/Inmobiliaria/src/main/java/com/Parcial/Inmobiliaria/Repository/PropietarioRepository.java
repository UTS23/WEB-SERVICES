package com.Parcial.Inmobiliaria.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Entity.Propietario;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {

}
