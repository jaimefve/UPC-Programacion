package org.example;

public class Tanque implements InterfazAtaque {

    private String modelo;
    private Torreta torreta;

    public Tanque(String modelo, Torreta torreta) {
        this.modelo = modelo;
        this.torreta = torreta;
    }
    public Tanque(String modelo, String modeloTorreta, String tipoMunicion) {
        this.modelo = modelo;
        Torreta torreta = new Torreta(modeloTorreta, tipoMunicion);
        this.torreta = torreta;
    }

    public void asignarTorreta(String modelo, String tipoMunicion) {
        Torreta torreta = new Torreta(modelo, tipoMunicion);
        this.torreta = torreta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String atacar() {
        return "pow";
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "modelo='" + modelo + '\'' +
                ", torreta=" + torreta +
                ", ataque= " + atacar() +
                '}';
    }
}

