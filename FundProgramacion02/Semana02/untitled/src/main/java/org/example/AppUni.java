package org.example;

public class AppUni {

        public static void main(String[] args) {
            Universidad uni = new Universidad("UPC");
            uni.agregarAlumno(new Alumno(1,"jaime","estrada",12,14,16,3,11));
            uni.agregarAlumno(new Alumno(2,"jaime2","estrada2",12,14,16,3,11));

            uni.imprimirListaAlumno();

        }
    }
