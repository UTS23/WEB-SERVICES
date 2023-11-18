package com.inmobiliaria.inmobiliaria.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inmobiliaria.inmobiliaria.entities.Cliente;
import com.inmobiliaria.inmobiliaria.serivices.ClienteService;

@RestController
@RequestMapping("/Cliente")
public class CLienteController {

    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public Iterable<Cliente> findAll(){
        return ClienteService.findAll();

    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable Long id){
    return clienteService.findById(id);

    }

}
