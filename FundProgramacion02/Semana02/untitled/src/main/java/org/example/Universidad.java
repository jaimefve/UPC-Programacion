package org.example;

import java.util.List;
import java.util.ArrayList;
public class Universidad {
//    private List<Alumno> listaAlumnos;

    private List<Alumno> listaAlumnos = new ArrayList<>();
    private String nombre;

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }
    public void imprimirListaAlumno() {
        for  (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }

    }


    //obtener mayor promedio
    public double obtenerMayorPromedio() {
        double mayor=0;
        double promedioAlumno=0;
        for (Alumno alumno : listaAlumnos) {
            promedioAlumno = alumno.getPromedioFinal();
            if (promedioAlumno>mayor) {
                mayor = promedioAlumno;
            }
        }
        return mayor;
    }
}
