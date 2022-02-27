package com.javatutoriales.patrones.builder.estrategiaC.model;

import lombok.Data;

@Data
public class Direccion {
    private final String ciudad;
    private final String codigoPostal;
    private String calle;
    private int numeroExterior;
    private int numeroInterior;

    Direccion(String ciudad, String codigoPostal) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }
}
