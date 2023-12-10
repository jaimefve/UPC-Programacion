package org.example;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws
            EdadInvalidaException    {
        if (edad<0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }

        this.nombre = nombre;
        this.edad = edad;
    }
}