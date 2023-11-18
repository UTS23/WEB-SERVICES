
package com.inmobiliaria.inmobiliaria.serivices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.entities.Cliente;
import com.inmobiliaria.inmobiliaria.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private static ClienteRepository clienteRepository;

    public static Iterable<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    public List<Cliente> findByNombre(String nombre) {
        return clienteRepository.findByNombre(nombre);
    }

    public List<Cliente> findByApellidos(String apellidos) {
        return clienteRepository.findByapellidos(apellidos);
    }

    public List<Cliente> findByEmail(String correoelectronico) {
        return clienteRepository.findBycorreo_electronico(correoelectronico);
    }

}
