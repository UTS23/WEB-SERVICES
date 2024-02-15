package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Entity.Oferta;
import com.Parcial.Inmobiliaria.Repository.OfertaRepository;
import com.Parcial.Inmobiliaria.Service.OfertaService;

import java.util.Optional;

@Service
public class OfertaServiceImpl implements OfertaService {
    private final OfertaRepository ofertaRepository;

    @Autowired
    public OfertaServiceImpl(OfertaRepository ofertaRepository) {
        this.ofertaRepository = ofertaRepository;
    }

    public Oferta saveOferta(Oferta oferta) {
        return ofertaRepository.save(oferta);
    }

    public Optional<Oferta> getOfertaByInmueble(Long inmuebleId) {
        // Implementa la lógica según tus necesidades
        return ofertaRepository.findById(inmuebleId);
    }

 
}