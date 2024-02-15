package com.Parcial.Inmobiliaria.Service;

import java.util.List;
import java.util.Optional;

import com.Parcial.Inmobiliaria.Entity.Cliente;

public interface ClienteService {
    Cliente saveCliente(Cliente cliente);

    Optional<Cliente> getClienteById(Long id);
    
    List<Cliente> getClientesConVisitas();
    // Otros métodos según sea necesario
}
