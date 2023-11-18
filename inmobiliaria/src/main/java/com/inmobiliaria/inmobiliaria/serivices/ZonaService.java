package com.inmobiliaria.inmobiliaria.serivices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.entities.ZonaCiudad;
import com.inmobiliaria.inmobiliaria.repositories.ZonaCiudadRepository;

@Service
public class ZonaService {

    @Autowired
    private ZonaCiudadRepository zonaCiudadRepository;

    public Iterable<ZonaCiudad> findAll() {
        return zonaCiudadRepository.findAll();
    }

    public ZonaCiudad findById(Long id) {
        return zonaCiudadRepository.findById(id).orElse(null);
    }

    public ZonaCiudad save(ZonaCiudad zonaCiudad) {
        return zonaCiudadRepository.save(zonaCiudad);
    }

    public void deleteById(Long id) {
        zonaCiudadRepository.deleteById(id);
    }

    public ZonaCiudad findByNombre(String nombre) {
        return zonaCiudadRepository.findByNombre(nombre);
    }
}
