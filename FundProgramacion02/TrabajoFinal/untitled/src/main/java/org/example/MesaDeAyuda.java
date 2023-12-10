package org.example;

import java.util.ArrayList;
import java.util.List;

public class MesaDeAyuda {

    /// Atributos
    private String nombre;
    private List<Incidencia> listaIncidencia;


    ///Contructor
    public MesaDeAyuda(String nombre) {
        this.nombre = nombre;
        this.listaIncidencia = new ArrayList<>();
    }

    ///Método para agregar incidencia

    public void agregarIncidencia(Incidencia incidencia) {
        this.listaIncidencia.add(incidencia);
    }

    @Override
    public String toString() {
        return "MesaDeAyuda{" +
                "nombre='" + nombre + '\'' +
                ", listaIncidencia=" + listaIncidencia +
                '}';
    }

}
