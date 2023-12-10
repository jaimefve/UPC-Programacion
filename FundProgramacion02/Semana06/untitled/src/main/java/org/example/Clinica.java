package org.example;
import java.util.ArrayList;
import java.util.List;

public class Clinica {
    public List<Mascota> mascotas;

    //Una clinica veterinaria puede existir sin mascotas

    public Clinica() {
        this.mascotas = new ArrayList<>();
    }

    //Metodo Registrar Mascota
    public void registrarMascota(String documento, String nombres, int edad) {
        Mascota mascota = new Mascota(documento, nombres, edad);
        this.mascotas.add(mascota);
    }

    //Buscar a la mascota
    public Mascota buscarMascota(String documento) {
        for (Mascota mascota : mascotas) {
            if (mascota.getDocumento().equals(documento)) {
                return mascota;
            }
        }
        return null;
    }

    //Asignar Hitorial
    public void asignarHistorial(String documento, Historial historial) {
        Mascota mascota = buscarMascota(documento);
        if (mascota !=null) {

            mascota.asignarHistorial(historial);
        }
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
