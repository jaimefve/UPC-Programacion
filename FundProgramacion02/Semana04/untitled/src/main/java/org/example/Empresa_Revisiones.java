package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa_Revisiones {

    private String nombre;
    private List<Vehiculo> listaVehiculos;

    public Empresa_Revisiones(String nombre) {
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<>();
    }
    //Agregar un metodo para agregar vehiculo
    public void agregarVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }
    //Listar vehiculos
    public void listarVehiculos() {
        for (Vehiculo v: listaVehiculos) {

            // if (this.anio>2019) {
            System.out.println (v);

            //}
        }
    }


}
