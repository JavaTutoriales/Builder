package com.javatutoriales.patrones.builder.estrategiaC;

import com.javatutoriales.patrones.builder.estrategiaC.model.DireccionBuilder;
import com.javatutoriales.patrones.builder.estrategiaC.model.TipoTelefono;
import com.javatutoriales.patrones.builder.estrategiaC.model.Usuario;
import com.javatutoriales.patrones.builder.estrategiaC.model.UsuarioBuilder;

public class EstrategiaCMain {
    public static void main(String[] args) {
        UsuarioBuilder builder = Usuario.builder("Alex", "programadorjava");
        builder.password("123456789");

        DireccionBuilder direccionBuilder = builder.direccion("Ficticia", "12345");
        direccionBuilder.calle("Calle");
        direccionBuilder.numeroExterior(13);
        direccionBuilder.build();

        builder.telefono("012345678", TipoTelefono.FIJO);
        builder.telefono("87654321", TipoTelefono.MOVIL);

        Usuario usuario = builder.build();

        System.out.println(usuario);
    }
}
