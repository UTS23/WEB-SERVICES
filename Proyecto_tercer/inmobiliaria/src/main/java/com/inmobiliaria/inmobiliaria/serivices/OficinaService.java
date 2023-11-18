
package com.inmobiliaria.inmobiliaria.serivices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.entities.Oficina;
import com.inmobiliaria.inmobiliaria.repositories.OficinaRepository;

@Service
public class OficinaService {

    @Autowired
    private OficinaRepository oficinaRepository;

    public Iterable<Oficina> findAll() {
        return oficinaRepository.findAll();
    }

    public Oficina findById(Long id) {
        return oficinaRepository.findById(id).orElse(null);
    }

    public Oficina save(Oficina oficina) {
        return oficinaRepository.save(oficina);
    }

    public void deleteById(Long id) {
        oficinaRepository.deleteById(id);
    }

    public List<Oficina> findByzona_ciudad_id(Integer zonaCiudad)  {
        return oficinaRepository.findByzona_ciudad_id(zonaCiudad);
    }

    public List<Oficina> findByprecio(Double precio) {
        return oficinaRepository.finByprecio(precio);
    }

    public List<Oficina> findBynumero_habitaciones(Integer numerohabitaciones) {
        return oficinaRepository.findBynumero_habitaciones(numerohabitaciones);
    }

    public List<Oficina> findByBaños(Integer baños) {
        return oficinaRepository.findBynumero_banos(baños);
    } 
}
