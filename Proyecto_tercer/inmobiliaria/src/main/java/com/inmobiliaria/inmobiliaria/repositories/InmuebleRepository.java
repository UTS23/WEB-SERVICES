package com.inmobiliaria.inmobiliaria.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.inmobiliaria.entities.Inmueble;


@Repository
public interface InmuebleRepository extends CrudRepository<Inmueble, Long> {

    Inmueble findByNombre(String nombre);

}