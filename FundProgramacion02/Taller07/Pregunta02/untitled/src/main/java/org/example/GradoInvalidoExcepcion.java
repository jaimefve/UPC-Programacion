package org.example;

public class GradoInvalidoExcepcion extends Exception {

    @Override
    public String getMessage() {
        return "Grado inválido";
    }
}
