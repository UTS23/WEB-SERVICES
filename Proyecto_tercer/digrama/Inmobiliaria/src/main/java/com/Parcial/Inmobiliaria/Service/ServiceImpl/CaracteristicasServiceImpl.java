package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Entity.Caracteristicas;
import com.Parcial.Inmobiliaria.Repository.CaracteristicasRepository;
import com.Parcial.Inmobiliaria.Service.CaracteristicasService;
import com.Parcial.Inmobiliaria.Service.InmuebleService;

import java.util.Optional;

@Service
public class CaracteristicasServiceImpl implements CaracteristicasService {
    private final CaracteristicasRepository caracteristicasRepository;

    @Autowired
    public CaracteristicasServiceImpl(CaracteristicasRepository caracteristicasRepository) {
        this.caracteristicasRepository = caracteristicasRepository;
    }

    public Caracteristicas saveCaracteristicas(Caracteristicas caracteristicas) {
        return caracteristicasRepository.save(caracteristicas);
    }

    public Optional<Caracteristicas> getCaracteristicasById(Long id) {
        return caracteristicasRepository.findById(id);
    }

    
}
