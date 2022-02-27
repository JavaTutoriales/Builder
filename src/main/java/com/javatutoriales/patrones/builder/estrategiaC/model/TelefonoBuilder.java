package com.javatutoriales.patrones.builder.estrategiaC.model;

class TelefonoBuilder {
    private final Telefono telefono;
    private final UsuarioBuilder usuarioBuilder;

    TelefonoBuilder(UsuarioBuilder usuarioBuilder, String numero, TipoTelefono tipoTelefono) {
        this.telefono = new Telefono(numero, tipoTelefono);
        this.usuarioBuilder = usuarioBuilder;
    }

    public UsuarioBuilder build(){
        usuarioBuilder.addTelefono(this.telefono);

        return usuarioBuilder;
    }
}
