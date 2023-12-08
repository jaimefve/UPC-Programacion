package org.example;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;

public class MesaDeAyuda {
    private String ticket;

    private List<Incidencia> listaincidencia;

    public MesaDeAyuda(String ticket) {
        this.ticket = ticket;
        this.listaincidencia = new ArrayList<>();
    }
    //Metodo para agregar incidentes
    public void agregarIncidente(Incidencia i){
        listaincidencia.add(i);
    }

    // Listar Incidencias
    public void listarIncidencias(){
        for(Incidencia i:listaincidencia){
            System.out.println(i);
        }
    }

}
