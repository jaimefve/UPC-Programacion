package org.example;
//Programa que permita validar la edad de una persona, no puede ser negativo
//1ro creamos la clase que hereda de excepcion
//2do creamos la clase que vamos a validar y ella debe lanzar la excepción
//3ero es la instancia del objeto
public class EdadInvalidaException extends Exception{

    public EdadInvalidaException() {
        super("La edad ingresada es invalida, debe ser un valor positivo");
    }

    public EdadInvalidaException(String message) {
        super(message);
    }
}
