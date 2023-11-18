package com.inmobiliaria.inmobiliaria.serivices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmobiliaria.inmobiliaria.entities.Inmueble;
import com.inmobiliaria.inmobiliaria.repositories.InmuebleRepository;

@Service
public class InmuebleService {

    @Autowired
    private InmuebleRepository InmuebleRepository;

    public Iterable<Inmueble> findAll() {
        return InmuebleRepository.findAll();
    }

    public Inmueble findById(Long id) {
        return InmuebleRepository.findById(id).orElse(null);
    }

    public Inmueble save(Inmueble inmueble) {
        return InmuebleRepository.save(inmueble);
    }

    public void deleteById(Long id) {
        InmuebleRepository.deleteById(id);
    }

}
