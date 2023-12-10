package org.example;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private String codigo;
    private List<Visita> visitas;

    public Historial(String codigo) {
        this.codigo = codigo;
        this.visitas = new ArrayList<>();
    }

    public List<Visita> getVisitas() {
        return visitas;
    }

    //REgistrar la visita en hitorial
    public void registrarVisita(String fecha, String motivo, double costo) {
        Visita visita  = new Visita(fecha,motivo,costo);
        this.visitas.add(visita);
    }
    //Calcular el monto
    public double calcularMontoTotal() {
        double montoTotal = 0;
        for (Visita visita: visitas) {
            montoTotal += visita.getCosto();
        }
        return montoTotal;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "codigo='" + codigo + '\'' +
                ", visitas=" + visitas +
                " monto total = " + calcularMontoTotal() +
                '}';
    }
}
