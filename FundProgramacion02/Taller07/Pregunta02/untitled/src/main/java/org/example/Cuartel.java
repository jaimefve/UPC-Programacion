package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cuartel {

    private String codigo;
    private String nombre;
    private List<Tanque> tanques;
    private List<Soldado> soldados;

    public Cuartel(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tanques = new ArrayList<>();
        this.soldados = new ArrayList<>();
    }

    public void registrarTanque(Tanque tanque) {
        this.tanques.add(tanque);
    }

    public void registrarSoldado(Soldado soldado) {
        this.soldados.add(soldado);
    }

    public int obtenerCapacidadAtaque() {
        int capacidadAtaque = 0;
        for (Soldado s: soldados) {
            capacidadAtaque = capacidadAtaque + s.getGrado();
        }
        capacidadAtaque = capacidadAtaque / soldados.size();
        return capacidadAtaque;
    }

    @Override
    public String toString() {
        return "Cuartel{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tanques=" + tanques +
                ", soldados=" + soldados +
                ", capacidadAtaque= " + obtenerCapacidadAtaque() +
                '}';
    }
}

