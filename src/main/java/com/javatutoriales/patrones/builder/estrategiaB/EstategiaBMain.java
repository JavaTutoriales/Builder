package com.javatutoriales.patrones.builder.estrategiaB;

import com.javatutoriales.patrones.builder.estrategiaB.model.Usuario;

public class EstategiaBMain {
    public static void main(String[] args) {
        Usuario.UsuarioBuilder builder = Usuario.builder("Programador", "programadorjava");

        builder.password("12345678");
        builder.nickname("programador");

        Usuario usuario = builder.build();

        System.out.println(usuario);
    }
}
