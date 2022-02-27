package com.javatutoriales.patrones.builder.estrategiaC.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UsuarioBuilderTest {
    @Test
    void usuarioCorrecto() {
        UsuarioBuilder usuarioBuilder = Usuario.builder("Programador Java", "programadorjava")
                .password("123456")
                .nickname("Programador")
                .telefono("12345780", TipoTelefono.MOVIL)
                .telefono("87654321", TipoTelefono.FIJO)
                .direccion("Ficticia", "12345")
                .calle("Calle")
                .numeroExterior(13).build();

        Usuario usuario = usuarioBuilder.build();

        assertThat(usuario.getNombre()).isEqualTo("Programador Java");
        assertThat(usuario.getUsername()).isEqualTo("programadorjava");
        assertThat(usuario.getPassword()).isEqualTo("123456");

        assertThat(usuario.getTelefonos()).hasSize(2);

        assertThat(usuario.getDireccion().getCiudad()).isEqualTo("Ficticia");
        assertThat(usuario.getDireccion().getCodigoPostal()).isEqualTo("12345");
        assertThat(usuario.getDireccion().getCalle()).isEqualTo("Calle");
        assertThat(usuario.getDireccion().getNumeroExterior()).isEqualTo(13);
    }

    @Test
    void excepcion_cuandoNoHayDireccion() {
        UsuarioBuilder usuarioBuilder = Usuario.builder("Programador Java", "programadorjava")
                .password("123456")
                .nickname("Programador")
                .telefono("12345780", TipoTelefono.MOVIL)
                .telefono("87654321", TipoTelefono.FIJO);


        assertThatThrownBy(() -> {
            Usuario usuario = usuarioBuilder.build();
        }).isExactlyInstanceOf(IllegalStateException.class);
    }

    @Test
    void excepcion_cuandoNoHayTelefono() {
        UsuarioBuilder usuarioBuilder = Usuario.builder("Programador Java", "programadorjava")
                .password("123456")
                .nickname("Programador")
                .telefono("12345780", TipoTelefono.MOVIL)
                .telefono("87654321", TipoTelefono.FIJO);


        assertThatThrownBy(() -> {
            Usuario usuario = usuarioBuilder.build();
        }).isExactlyInstanceOf(IllegalStateException.class);
    }
}