package com.javatutoriales.patrones.builder.estrategiaC.model;

import lombok.Data;

@Data
public class Telefono {
    private final String numero;
    private final TipoTelefono tipoTelefono;

    Telefono(String numero, TipoTelefono tipoTelefono) {
        this.numero = numero;
        this.tipoTelefono = tipoTelefono;
    }
}
