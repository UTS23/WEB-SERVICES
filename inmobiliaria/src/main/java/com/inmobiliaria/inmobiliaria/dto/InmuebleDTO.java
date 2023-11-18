package com.inmobiliaria.inmobiliaria.dto;
import lombok.Data;

@Data
public class InmuebleDTO {

    private Long id;
    private String tipo;
    private String direccion;
    private Integer numeroHabitaciones;
    private Integer numeroBaños;
    private Double area;
    private ZonaCiudadDTO zonaCiudad;
    private Boolean disponible;
    private Double precio;
    private String descripcion;

}