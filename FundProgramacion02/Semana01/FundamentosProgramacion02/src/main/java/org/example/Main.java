package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Alumno objLuis = new Alumno();
        Alumno objMarco = new Alumno();
        Alumno objMaria = new Alumno();
        Alumno objPepito = new Alumno(1,"Jymmy Dextre",11,12,13);
        Alumno objLuchito= new Alumno(2,"Luchito");

        System.out.println(objPepito.getNombres());

        objPepito.setNombres("Raul Estrada");
        System.out.println(objPepito.getNombres());

        //Encapsulación
        double resultado = objPepito.calcularPromedio();
        System.out.println(resultado);

        objLuchito.setNota1(12);
        objLuchito.setNota2(14);
        objLuchito.setNota3(16);
        resultado = objLuchito.calcularPromedio();
        System.out.println(resultado);

    }
}