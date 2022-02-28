package com.javatutoriales.patrones.builder.estrategiaB.model;

import lombok.Getter;

@Getter
public class Usuario {
    private final String nombre;
    private final String username;
    private String password;
    private short edad;
    private String nickname;

    private Usuario(String nombre, String username) {
        this.nombre = nombre;
        this.username = username;
    }

    public static UsuarioBuilder builder(String nombre, String username){
        return new UsuarioBuilder(nombre, username);
    }

    public static class UsuarioBuilder {

        private final Usuario usuario;

        private UsuarioBuilder(String nombre, String username) {
            usuario = new Usuario(nombre, username);
        }

        public UsuarioBuilder password(String password) {
            usuario.password = password;
            return this;
        }

        public UsuarioBuilder edad(short edad) {
            usuario.edad = edad;
            return this;
        }

        public UsuarioBuilder nickname(String nickname) {
            usuario.nickname = nickname;
            return this;
        }

        public Usuario build() {
            return this.usuario;
        }
    }
}
