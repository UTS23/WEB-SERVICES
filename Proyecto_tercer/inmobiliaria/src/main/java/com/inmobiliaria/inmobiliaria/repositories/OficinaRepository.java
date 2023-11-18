package com.inmobiliaria.inmobiliaria.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.inmobiliaria.entities.Oficina;


@Repository
public interface OficinaRepository extends CrudRepository<Oficina, Long> {
Oficina findBydireccion(String direccion);
List<Oficina> findBynumero_habitaciones(Integer numerohabitaciones);
List<Oficina> findBynumero_banos(Integer numerobanos);
Oficina findByarea(String area);
List<Oficina> findByzona_ciudad_id(Integer zonaCiudad); 
Oficina findBydisponible(String disponible);
List<Oficina> finByprecio(Double precio);
Oficina finBydescripcion(String descripcion);

}