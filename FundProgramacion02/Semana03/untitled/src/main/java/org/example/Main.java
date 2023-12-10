package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Crear los autos
        Auto objAuto1 = new Auto("PL01","Hyundai","Elantra","GRande","2","SI",4);
        Auto objAuto2 = new Auto("PL02","Toyota","Rav4","Grande","2","SI",5);
        Auto objAuto3 = new Auto("PL03","Nissan","Qashqai","Chica","1","SI",3);

        Scooter objScooter1 = new Scooter("PL04","sc01","mod",2);
        Scooter objScooter2 = new Scooter("PL05","sc01","mod",2);
        Scooter objScooter3 = new Scooter("PL06","sc01","mod",2);

        //Metodo para listar motos
        List<Scooter> listaScooter = new ArrayList<>();
        listaScooter.add(objScooter1);
        listaScooter.add(objScooter2);
        listaScooter.add(objScooter3);
        for (Scooter sc:listaScooter) {
            System.out.println(sc.toString());
        }

        objAuto1.correr();
        //Metodo para listar autos
        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(objAuto1);
        listaAutos.add(objAuto2);
        listaAutos.add(objAuto3);

        for (Auto au:listaAutos) {
            System.out.println(au.toString());
        }

    }
}