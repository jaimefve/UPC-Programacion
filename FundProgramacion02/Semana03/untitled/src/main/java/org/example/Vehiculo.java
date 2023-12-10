package org.example;

public class Vehiculo {
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    private String placa;
    private String marca;

    private String modelo;
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    //Constructor vacio
    public Vehiculo() {
    }
    //Metodo correr
    public void correr() {
        System.out.println("Estoy en el metodo correr de la clase Padre");
    }

}
