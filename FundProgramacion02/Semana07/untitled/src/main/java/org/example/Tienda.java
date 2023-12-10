package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;
    private List<Pelicula> listaPeliculas;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.listaPeliculas = new ArrayList<>();

    }

    public void agregarPelicula(Pelicula pelicula) {
        this.listaPeliculas.add(pelicula);
    }
}
