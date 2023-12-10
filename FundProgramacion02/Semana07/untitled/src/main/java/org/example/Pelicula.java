package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private int codigo;
    private String nombre;
    private Categoria categoria;
    private List<Actor> listaActores;

    public Pelicula(int codigo, String nombre, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.listaActores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        this.listaActores.add(actor);
    }


    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", listaActores=" + listaActores +
                '}';
    }
}
