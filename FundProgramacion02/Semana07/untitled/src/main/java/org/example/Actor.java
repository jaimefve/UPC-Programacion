package org.example;

public class Actor {
    private String nombre;
    private String nacionalodad;

    public Actor(String nombre, String nacionalodad) {
        this.nombre = nombre;
        this.nacionalodad = nacionalodad;
    }

    public String getNacionalodad() {
        return nacionalodad;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalodad='" + nacionalodad + '\'' +
                '}';
    }
}
