package org.example;

import java.util.Arrays;
import java.util.List;

public class Categoria {
    private String codigo;
    private String nombre;

    public Categoria(String codigo, String nombre) {
        // List<String>
        List<String> listaValores = Arrays.asList("Terror","Suspenso","Accion","Comedia","Animacion");
        if (!listaValores.contains(nombre)) {
            throw new RuntimeException("La categoria " + nombre + " no es valida");

        }
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
