package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Entity.Visita;
import com.Parcial.Inmobiliaria.Repository.VisitaRepository;
import com.Parcial.Inmobiliaria.Service.VisitaService;

import java.util.List;

@Service
public class VisitaServiceImpl implements VisitaService{
    private final VisitaRepository visitaRepository;

    @Autowired
    public VisitaServiceImpl(VisitaRepository visitaRepository) {
        this.visitaRepository = visitaRepository;
    }

    public Visita saveVisita(Visita visita) {
        return visitaRepository.save(visita);
    }

    public List<Visita> getVisitasByInmueble(Long inmuebleId) {
        // Implementa la lógica según tus necesidades
        return visitaRepository.findAll();
    }

    
}