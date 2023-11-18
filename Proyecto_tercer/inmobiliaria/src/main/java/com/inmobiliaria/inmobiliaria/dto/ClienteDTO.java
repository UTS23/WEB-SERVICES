package com.inmobiliaria.inmobiliaria.dto;


import lombok.Data;

@Data
public class ClienteDTO {

    private Long id;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String telefono;

}