package com.javatutoriales.patrones.builder.estrategiaC.model;

import java.util.HashSet;

public class UsuarioBuilder {
    private final Usuario usuario;

    UsuarioBuilder(String nombre, String username) {
        this.usuario = new Usuario(nombre, username);
        this.usuario.setTelefonos(new HashSet<>());
    }

    public UsuarioBuilder password(String password) {
        usuario.setPassword(password);

        return this;
    }

    public UsuarioBuilder edad(short edad) {
        usuario.setEdad(edad);

        return this;
    }

    public UsuarioBuilder nickname(String nickname) {
        usuario.setNickname(nickname);

        return this;
    }

    public UsuarioBuilder telefono(String numero, TipoTelefono tipoTelefono) {
        return new TelefonoBuilder(this, numero, tipoTelefono).build();
    }

    public DireccionBuilder direccion(String ciudad, String codigoPostal) {
        return new DireccionBuilder(this, ciudad, codigoPostal);
    }

    void addTelefono(Telefono telefono) {
        usuario.getTelefonos().add(telefono);
    }

    void addDireccion(Direccion direccion) {
        usuario.setDireccion(direccion);
    }

    public Usuario build() {
        validaUsuario();

        return this.usuario;
    }

    private void validaUsuario() {
        if (usuario.getDireccion() == null || usuario.getTelefonos().isEmpty()) {
            String mensaje = String.format("El usuario debe tener una dirección y al menos un telefono. Dirección: %s. Teléfono: %s",
                    usuario.getDireccion(), usuario.getTelefonos());

            throw new IllegalStateException(mensaje);
        }
    }
}

