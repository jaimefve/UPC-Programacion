package org.example;

public class SalaRegular extends Sala {

    private double factorAumento;

    public SalaRegular(String codigo, String nombre, int capacidad, double precioBase, double factorAumento) {
        super(codigo, nombre, capacidad, precioBase);
        this.factorAumento = factorAumento;
    }

    public double getFactorAumento() {
        return factorAumento;
    }

    public void setFactorAumento(double factorAumento) {
        this.factorAumento = factorAumento;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() * factorAumento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "SalaRegular{" +
                "factorAumento=" + factorAumento +
                '}';
    }
}