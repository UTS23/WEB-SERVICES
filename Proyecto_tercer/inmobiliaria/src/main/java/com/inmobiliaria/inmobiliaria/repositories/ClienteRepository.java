package com.inmobiliaria.inmobiliaria.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.inmobiliaria.entities.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByapellidos(String apellidos);
    List<Cliente> findBycorreo_electronico(String correo_electronico);
    Cliente findBytelefono(String telefono);
    Cliente findBytipo(String tipo);
}
