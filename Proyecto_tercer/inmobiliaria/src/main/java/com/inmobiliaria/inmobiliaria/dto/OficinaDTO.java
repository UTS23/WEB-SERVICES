package com.inmobiliaria.inmobiliaria.dto;
import lombok.Data;

@Data
public class OficinaDTO {

    private Long id;
    private String direccion;
    private Integer numeroHabitaciones;
    private Integer numeroBaños;
    private Double area;
    private ZonaCiudadDTO zonaCiudad;


}