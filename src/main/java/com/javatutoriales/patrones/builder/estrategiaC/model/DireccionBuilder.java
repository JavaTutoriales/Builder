package com.javatutoriales.patrones.builder.estrategiaC.model;

public class DireccionBuilder {

    private final UsuarioBuilder usuarioBuilder;
    private final Direccion direccion;

    DireccionBuilder(UsuarioBuilder usuarioBuilder, String ciudad, String codigoPostal) {
        this.direccion = new Direccion(ciudad, codigoPostal);
        this.usuarioBuilder = usuarioBuilder;
    }

    public DireccionBuilder calle(String calle) {
        direccion.setCalle(calle);
        return this;
    }

    public DireccionBuilder numeroExterior(int numeroExterior) {
        direccion.setNumeroExterior(numeroExterior);
        return this;
    }

    public DireccionBuilder numeroInterior(int numeroInterior) {
        direccion.setNumeroInterior(numeroInterior);
        return this;
    }

    public UsuarioBuilder build() {
        usuarioBuilder.addDireccion(this.direccion);
        return usuarioBuilder;
    }
}
