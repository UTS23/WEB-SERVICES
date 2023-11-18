package com.inmobiliaria.inmobiliaria.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.inmobiliaria.entities.ZonaCiudad;

@Repository
public interface ZonaCiudadRepository extends CrudRepository<ZonaCiudad, Long> {

    ZonaCiudad findByNombre(String nombre);
    ZonaCiudad findBydescripcion(String descripcion);

}

