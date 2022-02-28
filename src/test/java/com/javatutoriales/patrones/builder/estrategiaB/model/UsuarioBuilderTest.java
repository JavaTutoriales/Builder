package com.javatutoriales.patrones.builder.estrategiaB.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UsuarioBuilderTest {
    @Test
    void usuarioCorrecto() {
        Usuario.UsuarioBuilder usuarioBuilder = Usuario.builder("Programador Java", "programadorjava")
                .password("123456")
                .nickname("Programador");

        Usuario usuario = usuarioBuilder.build();

        assertThat(usuario.getNombre()).isEqualTo("Programador Java");
        assertThat(usuario.getUsername()).isEqualTo("programadorjava");
        assertThat(usuario.getPassword()).isEqualTo("123456");
    }
}