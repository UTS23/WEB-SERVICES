package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Entity.Cliente;
import com.Parcial.Inmobiliaria.Repository.ClienteRepository;
import com.Parcial.Inmobiliaria.Service.ClienteService;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> getClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> getClientesConVisitas() {
        
        return clienteRepository.findAll();
    }

    
}
