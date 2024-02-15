package com.Parcial.Inmobiliaria.Service.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Entity.Inmueble;
import com.Parcial.Inmobiliaria.Repository.InmuebleRepository;
import com.Parcial.Inmobiliaria.Service.InmuebleService;

import java.util.List;
import java.util.Optional;

@Service
public class InmuebleServiceImpl implements InmuebleService{
    private final InmuebleRepository inmuebleRepository;

    @Autowired
    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
        this.inmuebleRepository = inmuebleRepository;
    }

    public Inmueble saveInmueble(Inmueble inmueble) {
        return inmuebleRepository.save(inmueble);
    }

    public Optional<Inmueble> getInmuebleById(Long id) {
        return inmuebleRepository.findById(id);
    }

    public List<Inmueble> getInmueblesDisponibles(String tipoOferta) {
        // Implementa la lógica según tus necesidades
        return inmuebleRepository.findAll();
    }

    
}
