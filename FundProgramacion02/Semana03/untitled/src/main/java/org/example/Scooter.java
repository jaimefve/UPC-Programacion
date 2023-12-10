package org.example;

public class Scooter extends Vehiculo{

    private int nrollantas;
    public Scooter(String placa, String marca, String modelo, int nrollantas) {
        super(placa, marca, modelo);
        this.nrollantas = nrollantas;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "nrollantas=" + nrollantas +
                '}';
    }
}
