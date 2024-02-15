package com.Parcial.Inmobiliaria.Entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Inmueble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private double superficie;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;

    @OneToOne(mappedBy = "inmueble", cascade = CascadeType.ALL)
    private Oferta oferta;

    @ManyToOne
    @JoinColumn(name = "oficina_id")
    private Oficina oficina;

    @OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL)
    private List<Visita> visitas;

    @ManyToMany
    @JoinTable(name = "inmueble_caracteristicas",
            joinColumns = @JoinColumn(name = "inmueble_id"),
            inverseJoinColumns = @JoinColumn(name = "caracteristicas_id"))
    private Set<Caracteristicas> caracteristicas;

   
}
