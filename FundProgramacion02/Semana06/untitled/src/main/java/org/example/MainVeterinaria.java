package org.example;

import java.util.List;

public class MainVeterinaria {

    public static void main(String[] args) {
        Clinica clinicaA = new Clinica();
        clinicaA.registrarMascota("1234","Felix1",2);
        clinicaA.registrarMascota("1235","Felix2",3);
        clinicaA.registrarMascota("1236","Felix3",4);
        //  clinicaA.registrarMascota("1237","Felix4",5);

        Historial historialA = new Historial("H01");
        historialA.registrarVisita("16/11/23","control",700);
        historialA.registrarVisita("17/11/23","intervencion",600);

        Historial historialB = new Historial("H01");
        historialB.registrarVisita("16/11/23","control",500);
        historialB.registrarVisita("17/11/23","intervencion",400);

        Historial historialC = new Historial("H01");
        historialC.registrarVisita("16/11/23","cirugia",1200);
        historialC.registrarVisita("17/11/23","cirugia de alto riesgo",2000);

        clinicaA.asignarHistorial("1234",historialA);
        clinicaA.asignarHistorial("1235",historialB);
        clinicaA.asignarHistorial("1236",historialC);

        System.out.println("Mascotas registradas");
        List<Mascota> mascotasRegistrados = clinicaA.getMascotas();
        for (Mascota mascota: mascotasRegistrados) {
            System.out.println(mascota);
        }
    }
}