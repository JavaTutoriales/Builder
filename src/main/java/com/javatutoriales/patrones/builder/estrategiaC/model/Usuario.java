package com.javatutoriales.patrones.builder.estrategiaC.model;

import lombok.Data;

import java.util.Set;

@Data
public class Usuario {
    private final String nombre;
    private final String username;
    private String password;
    private short edad;
    private String nickname;

    private Direccion direccion;
    private Set<Telefono> telefonos;

    Usuario(String nombre, String username) {
        this.nombre = nombre;
        this.username = username;
    }

    public static UsuarioBuilder builder(String nombre, String username){
        return new UsuarioBuilder(nombre, username);
    }
}
