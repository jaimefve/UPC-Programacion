package org.example;

public class CodUsuarioException extends Exception{

    public CodUsuarioException() {
        super("ERROR: ingresar la u al inicio del código");
    }

    public CodUsuarioException(String message) {
        super(message);
    }

}
