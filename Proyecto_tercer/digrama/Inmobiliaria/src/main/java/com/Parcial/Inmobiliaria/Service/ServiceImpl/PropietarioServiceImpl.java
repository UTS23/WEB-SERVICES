package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Entity.Propietario;
import com.Parcial.Inmobiliaria.Repository.PropietarioRepository;
import com.Parcial.Inmobiliaria.Service.PropietarioService;

import java.util.Optional;

@Service
public class PropietarioServiceImpl implements PropietarioService {
    private final PropietarioRepository propietarioRepository;

    @Autowired
    public PropietarioServiceImpl(PropietarioRepository propietarioRepository) {
        this.propietarioRepository = propietarioRepository;
    }

    public Propietario savePropietario(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }

    public Optional<Propietario> getPropietarioById(Long id) {
        return propietarioRepository.findById(id);
    }
}