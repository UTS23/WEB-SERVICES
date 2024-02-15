package com.Parcial.Inmobiliaria.Service.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Entity.Oficina;
import com.Parcial.Inmobiliaria.Repository.OficinaRepository;
import com.Parcial.Inmobiliaria.Service.OficinaService;

import java.util.Optional;

@Service
public class OficinaServiceImpl implements OficinaService{
    private final OficinaRepository oficinaRepository;

    @Autowired
    public OficinaServiceImpl(OficinaRepository oficinaRepository) {
        this.oficinaRepository = oficinaRepository;
    }

    public Oficina saveOficina(Oficina oficina) {
        return oficinaRepository.save(oficina);
    }

    public Optional<Oficina> getOficinaById(Long id) {
        return oficinaRepository.findById(id);
    }

}
